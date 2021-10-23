import React from 'react';
import { BrowserRouter as Router } from "react-router-dom";
import Header from './Header';
import Footer from './Footer';
import routes from "./Router";

export default function Layout() {
    return (
        <div id='layout'>
            <Router>
                <Header />
                {routes}
                <Footer />
            </Router>
        </div>
    );
}