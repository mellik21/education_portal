import React, {useState, useEffect} from "react";
import { Route, BrowserRouter as Router, Switch } from 'react-router-dom'
import Header from './components/Header/Header';

function App (props) {
    
    const [pingStatus, setPingStatus] = useState(0);

    useEffect(() => {
        fetch("/ping").then((res) => {
            setPingStatus(res.status);
        })
    }, []);
    
    
    return (
        <>
            <Router>
                <Header />

                <div>
                    <h2>App component</h2>
                    <p>Test mock ping status code is {pingStatus}</p>
                </div> 

                <Switch>
                    <Route path = '/contacts'></Route>
                </Switch>
            </Router>       
        </>

    )
}

export default App;