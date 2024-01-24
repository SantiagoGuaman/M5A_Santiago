import React, { useState } from 'react'
import { API_URL } from '../API_URL';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

export default function CreateProduct() {

    let navegation = useNavigate();

    const [product, setProduct] = useState({
        productName: '',
        price: '',
        expiryDate: '',
    });

    const{productName, price, expiryDate} = product;

    const onInputChange = (e) => {
        //Spread operator ... (Expands the atributes)
        setProduct({ ...product, [e.target.name]: e.target.value });
    };

    const onSubmit = async (e) => {
        e.preventDefault();
        const EndPoint = API_URL + '/products/create';
        await axios.post(EndPoint, product);
        //Redirect to List
        navegation('/')
    };

    return (
        <div className='container mt-5'>
            <form onSubmit={(e) => onSubmit(e)}>
               <div className='form-group'>
               <div className='header mb-2'>
                    <h5>Agregar un nuevo producto</h5>
                </div>
                <div className="form-group">
                    <label htmlFor="productName">Nombre del producto</label>
                    <input type="text" className="form-control" id="productName" name='productName' required={true}
                        value={productName} onChange={(e) => onInputChange(e)} />
                </div>
                <div className="form-group">
                    <label htmlFor="price">Precio</label>
                    <input type="number" className="form-control" step='any' id="price" name='price' required={true}
                        value={price} onChange={(e) => onInputChange(e)} />
                </div>
                <div className="form-group">
                    <label htmlFor="expiryDate">Fecha Expiración</label>
                    <input type="date" className="form-control" id="expiryDate" name='expiryDate' required={true}
                        value={expiryDate} onChange={(e) => onInputChange(e)} />
                </div>
                <div className='footer mt-4'>
                    <button type="submit" className="btn btn-secondary">Guardar</button>
                </div>
               </div>
            </form>
        </div>
    )
}
