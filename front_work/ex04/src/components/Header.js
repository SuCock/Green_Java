export const Header1 = (props) => {
    console.log(props);
    console.log(props.title);
    return ( 
        <>
            <h1 className='aa'>
                {props.title}
            </h1>
        </> 
    );
}

// Header2를 내보낼려면 export를 적어준다
export const Header2 = (props) => {
    console.log(props);
    return(
        <>
            <h1 className='aa'>{props.key1}</h1>
            <h1 className='aa'>{props.value}</h1>
        </>
    )
}

// a = []
// b = {a:1, b:2}
// 객체 분할 문법
// props = {key1:'제목', value:'2번'}
export const Header3 = ({name, value}) => {
    return(
        <>
            <h1 className='aa'>제목333</h1>
            <h1 className='aa'>{name}</h1>
            <h1 className='aa'>{value}</h1>
        </>
    )
}

 // Header1를 기본적으로 내보네겠다
// export default Header1;