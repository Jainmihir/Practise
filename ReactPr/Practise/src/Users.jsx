import React, {useState,useEffect} from "react";
import {getPost} from './UserData.js';
export default function Users(){
    const [data , setData] = useState(null);
    
    useEffect(() => {
        getPost().then((posts) => setData(posts));
    },[])

    return (
        <>
            {data ? 
                (data.map((e) => <h1 key={e.id}> {e.login}</h1>)) : <>No Data Found</>    
            }


        </>
    )
}