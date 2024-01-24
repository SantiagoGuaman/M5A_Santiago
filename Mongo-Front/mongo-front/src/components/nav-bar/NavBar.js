import React from 'react'
import { Link } from 'react-router-dom'

export default function NavBar() {
    return (
        <div className='header'>
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <a className="navbar-brand ml-2" href="/" style={{textDecoration: 'bold', color: '#FFFF'}}>MONGO APP</a>
                <button className="navbar-toggler" type="button" data-toggle="collapsed" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarNav">
                    <ul className="navbar-nav">
                        <li className="nav-item active">
                            <a className="nav-link" href="/">Lista</a>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/create">Crear</Link>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    )
}
