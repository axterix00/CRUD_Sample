import React from 'react';
import { Switch, Route } from "react-router-dom";
import Home from "../Home"
import About from "../About"
import MissingPage from "../MissingPage"

const routes = (
    <Switch>
        <Route path="/" exact component={Home} />
        <Route path="/about" component={About} />
        <Route component={MissingPage} />
    </Switch>
);

export default routes;