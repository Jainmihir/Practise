import { useEffect, useState , useRef } from 'react'
import './App.css'
import Card from './Card'
import LoginForm from './LoginForm';
import Users from './Users';

function App() {
  const [count, setCount] = useState(0)
  const [isVisible , setVisible] = useState(true);
  const one = useRef(0);
  const inputRef = useRef(null);
  const counter = () => {
    setCount(count+1);
  }

  useEffect(() => {
    one.current = one.current + 1;
  });

  const handleClick = () => {
    // Focus the input element on button click
    inputRef.current.focus();
  };
  // useEffect(() => {
  //   alert("Count is increment");
  // },[count])

  return (
    <>

      {isVisible ? <LoginForm/> : <> </>}
      <button onClick={() => setVisible(!isVisible)} >Hide Form</button>

      <br/>
      <Users/> 
      <br/>
      <Card count={count}/>   
      <button onClick={counter}>Increment</button>
      <br/>
      <h1>Render one: {one.current}</h1>
      <br/>
      <div>
      <input ref={inputRef} type="text" />
      <button onClick={handleClick}>Focus Input</button>
       </div>


    </>
  )
}

export default App
