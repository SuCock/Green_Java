import React, { useState } from 'react';
import axios from 'axios';

import Button from '@mui/material/Button';

// Person밖으로 빼내면
// getPerson를 호출하더라도 Person은 재랜더링되지 않는다
const getPerson = async () =>  {
    const id = parseInt(Math.random() * 3 + 1);
    // awit는 동기
    // 통신이 끝나면 result에 담겠다
    const result = await axios.get(`http://localhost:8080/person/one/${id}`); // 백틱을 사용해서 동적으로 id넣기
    console.log(result);
    return result.data;
}
const Person = ({name:paramName, age:paramAge}) => {
    console.log('Person');
    const [age, setAge] = useState(paramAge);
    const [name, setName] = useState(paramName);
    // Person만 렌더링
    const ageUp = () => {
        setAge(age + 1);
    }
    const ageDown = () => {
        setAge(age - 1);
    }
    
    return( 
        <>
            <h1>Person</h1>
            <h2>이름 = {name}</h2>
            <h2>나이 = {age}</h2>
            <Button onClick={ageUp} variant="text">나이증가</Button>
            <Button onClick={ageDown} variant="contained">나이감소</Button>
            <Button onClick={async() => {
                const data = await getPerson();
                setAge(data.age);
                setName(data.name);
            }} variant="outlined">가져오기</Button>
        </>);
}
export default Person;