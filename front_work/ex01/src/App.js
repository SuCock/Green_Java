import logo from './기리.jpg';
import './App.css';
import React, { useState } from 'react';

function App() {

  const[itemNm, setItemNm] = useState('커피');
  const[price, setPrice] = useState('가격');

  const newItem = () => {
    console.log('newItem');
    fetch('http://localhost:8080/api/item/new', {
      method: 'POST',
      headers: {
        'Content-Type' : 'application/json'
      }
    })
    .then(response => response.json())
    .then(data => {
      console.log('Success', data);
      setItemNm(data.itemNm);
      setPrice(data.price);
    })
  }
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <button onClick={newItem}>AddItem</button>
        <p>
          itemNm = {itemNm}
          <br/>
          price = {price}
        </p>
        <a
          className="App-link"
          href="https://kauth.kakao.com/oauth/authorize?client_id=6890093e1db4f8b5a83186208edbc0f9&redirect_uri=http://localhost:8080/oauth/kakao/callback&response_type=code"
          // target="_blank"
          rel="noopener noreferrer"
        >
          Kakao Login
        </a>
      </header>
    </div>
  );
}

export default App;
