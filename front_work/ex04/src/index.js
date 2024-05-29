import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import App2 from './App2';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    // index.js에서 <App/> 함수가 호출되는 것이다.
    // <App />
    // jsx 문법
    <App2 />
);
reportWebVitals();
