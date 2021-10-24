import React from 'react';
import { Link } from "react-router-dom";
import { Anchor } from 'antd';

export default function Header() {
    return (
        <Anchor className="Header">
            <Link to="/">Home</Link>
            <Link to="/about">About</Link>
            <Link to="/x">404</Link>
        </Anchor>
    );
}
