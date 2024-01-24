import './App.css';
import ProductsList from './products/ProductsList';
import NavBar from './components/nav-bar/NavBar';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import CreateProduct from './products/CreateProduct';
import EditProduct from './products/EditProduct';

function App() {
  return (
    <div className="d-flex flex-column min-vh-100">
      <BrowserRouter>
        <NavBar />
        <Routes>
          <Route exact path='/' element={<ProductsList />}/>
          <Route exact path='/create' element={<CreateProduct />}/>
          <Route exact path='/edit/:_id' element={<EditProduct />}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
