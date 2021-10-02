import React, { Component } from 'react';
import Header from './Header';
import Footer from './Footer';

class Layout extends Component {
    render() {
        return (
            <div id='layout'>
                <Header />
                <Footer />
            </div>
        );
    }
}
export default Layout;