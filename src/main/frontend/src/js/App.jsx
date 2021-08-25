import React, {useState, useEffect} from "react";
import Header from './components/Header/Header';

function App (props) {
    
    const [pingStatus, setPingStatus] = useState(0);

    useEffect(() => {
        fetch("/ping").then((res) => {
            setPingStatus(res.status);
        })
    }, []);
    
    
    return (

        <Header />

        <div>
            <h2>App component</h2>
            <p>Test mock ping status code is {pingStatus}</p>
        </div>

    )
}

export default App;