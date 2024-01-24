import React, { useEffect, useState } from 'react'
import { API_URL } from '../API_URL'
import axios from 'axios';
import { NumericFormat } from 'react-number-format';
import { Link } from 'react-router-dom';

export default function ProductsList() {

    const EndPoint = API_URL + '/products';

    const [products, setProduct] = useState([]);

    useEffect(() => {
        loadProducts();
    }, []);

    const loadProducts = async () => {
        const result = await axios.get(EndPoint);
        console.log(result);
        setProduct(result.data);
    };

    const deleteProduct = async (_id) => {
        await axios.delete(`${EndPoint}/delete/${_id}`);
        loadProducts();
    };

    return (
        <div className='container mt-5'>
            <div className='card text-center mb-5' style={{ backgroundColor: '#00A2E8' }}>
                <h5 style={{ color: '#FFFFFF' }}>Lista de Productos</h5>
            </div>
            <table className="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Nombre</th>
                        <th scope="col">Precio</th>
                        <th scope="col">Fecha Expiración</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        //Here we use a Loop
                        products.map((pro, index) => (
                            <tr key={index}>
                                <td>{pro.productName}</td>
                                <td><NumericFormat value={pro.price}
                                    displayType={'text'} thousandSeparator=',' prefix='$ ' decimalScale={2}
                                    fixedDecimalScale />
                                </td>
                                <td>{pro.expiryDate}</td>
                                <td>
                                    <div className='container'>
                                        <Link to={`/edit/${pro._id}`} className='btn btn-warning mr-2'>
                                            Editar
                                        </Link>
                                        <button className='btn btn-danger ml-2' onClick={() => deleteProduct(pro._id)}>
                                            Eliminar
                                        </button>
                                    </div>
                                </td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    )
}
