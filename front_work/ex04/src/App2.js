import React, { useState } from 'react';
import Person from './components/Person';


// App2가 계속 재랜더링된다
const App2 = () => {
    console.log('App2');
    //                       초기값
    const [a,setA] = useState(10);
    const doA = () => {
        setA(a + 1);
        // 정적변수(한번 초기화하면 끝)라서 안된다
        // setA로 해야한다
        // a = a+1;
    }
    return ( 
        <>
            <h1>App2</h1>
            <h2>{a}</h2>
            <button onClick={doA}>Update A</button>
            {/* 중괄호는 숫자 */}
            <Person name="홍길동" age={20}></Person>
            <Person name="박길동" age={30}></Person>
            <Person name="이길동" age={40}></Person>
        </>
    );
}

export default App2;