import React, {useState, useEffect} from "react";

function App (props) {
    
    const [pingStatus, setPingStatus] = useState(0);

    useEffect(() => {
        fetch("/ping").then((res) => {
            setPingStatus(res.status);
        })
    }, []);
    
    
    return (
        <div>
            <h2>App component</h2>
            <p>Test mock ping status code is {pingStatus}</p>
        </div>
    )
}

export default App;