import axios from 'axios';

export const getLottoNumber = async () => {
    const fetchData = async() => {
        // axios -> 백엔드와 통신
        const result = await axios.get('/test/test')
        console.log(result.data);
        console.log(result.status);
    } 
    fetchData();

};