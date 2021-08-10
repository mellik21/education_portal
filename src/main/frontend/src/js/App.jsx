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
    )
}

export default App;