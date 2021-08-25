import React from "react";
import ReactDOM from "react-dom";
import App from './js/App';

ReactDOM.render (
    <App />, document.getElementById("page-content")
)
fetch("/ping").then((resp) => {
    console.log(`Test mock response satatus code is ${resp.status}`);
})