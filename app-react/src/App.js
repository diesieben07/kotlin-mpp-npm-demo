import React from 'react';
import logo from './logo.svg';
import './App.css';
import mpp from 'kotlin-mpp-npm-demo-mpp'

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/>
                <p>
                    {mpp.de.takeweiland.kotlinmppnpmdemo.common.commonFun()}
                </p>
                <p>
                    Edit <code>src/App.js</code> and save to reload.
                </p>
                <a
                    className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Learn React
                </a>
            </header>
        </div>
    );
}

export default App;
