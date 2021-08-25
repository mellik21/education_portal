import React from 'react'
import Button from '../Button/Button';
import './header.scss'

const Header = () => {
    return (
        <header className = 'header'>
            <section className = 'header__top'>
                <div className = 'header__top_nav'>
                    <Button 
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
    )
}

export default Header
