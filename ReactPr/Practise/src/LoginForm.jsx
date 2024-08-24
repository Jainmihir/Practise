import React, { useEffect, useState } from "react";

export default function LoginForm() {
    
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const handleUsername = (e) => {
        setUsername(e.target.value);
    }
    const handlePassword = (e) => {
        setPassword(e.target.value);
    }

    const handleSubmitForm = (e) => {
        e.preventDefault();
        setUsername('');
        setPassword('');
    }

 

    return (
        <>
        <form onSubmit={handleSubmitForm}>
            <label>
                Username : 
                <input
                    type="text"
                    value={username}
                    onChange={handleUsername}
                    required
                />
            </label>
            <br/>
            <label>
                Password : 
                <input
                    type="password"
                    value={password}
                    onChange={handlePassword}
                    required
                />          
                </label>
            <br/>
            <button type="submit">Login</button>
        </form>

        
        </>
    )
}