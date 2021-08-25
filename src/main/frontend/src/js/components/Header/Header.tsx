import React from 'react'
import { Route, BrowserRouter as Router, Switch } from 'react-router-dom'
import Button from '../Button/Button'
import './header.scss'

const Header = () => {
    return (
        <>
            <Router>
                <header className = 'header'>
                    <section className = 'header__top'>
                        <div className = 'header__top_nav'>
                            <Button 
                                type = 'link'
                                background = 'green'
                                content = 'Обратная связь'
                                link = '/contacts'
                            />
                        </div>
                        <div className = 'header__top_personal'>

                        </div>
                    </section>
                    <section className = 'header__bottom'>
                        <nav className = 'header__bottom_navigation'>

                        </nav>
                    </section>
                </header>

                <Switch>
                    <Route path = '/contacts'>

                    </Route>
                </Switch>
            </Router>
        </>
    )
}

export default Header
