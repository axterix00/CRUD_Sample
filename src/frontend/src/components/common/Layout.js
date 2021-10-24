import React from 'react';
import { BrowserRouter as Router } from "react-router-dom";
import Header from './Header';
import Footer from './Footer';
import routes from "./Router";
import '../../resources/css/Common.css';

export default function Layout() {
    return (
        <div className='Layout'>
            <Router>
                <Header />
                <div className='Layout-Inner'>
                        {routes}
                </div>
                <Footer />
            </Router>
        </div>
    );
}