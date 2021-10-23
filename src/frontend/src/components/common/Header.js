import React from 'react';
import { Link } from "react-router-dom";

export default function Header() {
    return (
        <div className="Header">
            <Link to="/">Home</Link>
            <br />
            <Link to="/about">About</Link>
            <br />
            <Link to="/x">404</Link>
        </div>
    );
}
