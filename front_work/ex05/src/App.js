import './App.css';
import React, { useEffect, useState, useMemo } from 'react';

function App() {
  const [count, setCount] = useState(0);
  const [name, setName] = useState('홍길동');
  
  const memo_var = useMemo(() => {
    return {x:0,y:0};
  },[]);

  console.log(memo_var); // 객체

  const [location, setLocation] = useState(({x:memo_var.x,y:memo_var.y}));

  // useStae 훅은 화면 재랜더링을 일으키는 것이다.
  // -> 값이 변경될때 화면에 랜더링 시키는 것
  // useEffect 화면이 랜더링 되어질때 실행된다 -> 의존성 배열에 넣은 값이 바뀔때 실행된다.

  // 자바스크립트는 자료형 타입이 있다 -> 기본타입, 객체타입
  // location = {x:0, y:0}객체타입(new예약어를 쓴거랑 같다)
  const a = {x:0,y:0};
  const b = {x:0,y:0};

  console.log(a===b); // -> false

  // 기존값 {x:0,y:0}이랑 setLocation 값{x:0,y:0}이 같아도 다르다고 나옴으로 재랜더링된다

  // useMemo useCallback memo
  // 주소기억
  // useMemo 객체의 주소값을 기억한다
  // useCallback 함수의 주소값 기억
  // memo 컴포넌트의 주소값 기억

  useEffect(() => {
    console.log("화면이 랜더링 되어질때 실행됩니다.");
  },[location]) // 의존성 배열로 한번만 된다

  return (
    <div className="App">
      <div>
        <h1>Header</h1>
      </div>
      <div>
        <h1>Content</h1>
        <div>
          <span style={{display:'block'}}>count = {count}</span>
          <br/>
          <button onClick={() => {setCount(count+1)}}>Click</button>
        </div>
        <br/>
        <div>
          <span style={{display:'block'}}>name = {name}</span>
          <br/>
          <button onClick={() => {name === '홍길동' ? setName('박길동') : setName('홍길동');}}>Click</button>
        </div>
        <div>
          <span style={{display:'block'}}>location = {location.x}</span>
          <span style={{display:'block'}}>location = {location.y}</span>
          <span style={{display:'block'}}>location = {JSON.stringify(location)}</span>
          <br/>
          <button onClick={() => {setLocation(memo_var)}}>Click</button>
          {
            // useMemo를 쓰면 객제의 주소가 같아서 재랜더링이 이루어지지 않는다
          } 
        </div>
      </div>
      <div>
        <h1>Footer</h1>
      </div>
    </div>
  );
}

export default App;
