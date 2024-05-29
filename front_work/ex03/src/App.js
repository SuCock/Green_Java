import './App.css';
import BasicLayout from './layout/BasicLayout';
import { Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import About from './pages/About';
import Contact from './pages/Contact';

function App() {
  return (
    <div className="App">
      <header>
        <BasicLayout>
          <Routes>
            <Route path='/' element={<Home/>} />
            <Route path='/about' element={<About/>} />
            <Route path='/contact' element={<Contact/>} />
          </Routes>
        </BasicLayout>
      </header>
    </div>
  );
}

export default App;
