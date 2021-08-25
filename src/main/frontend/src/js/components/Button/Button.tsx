import React, { FC } from 'react'
import { Link } from 'react-router-dom';

interface ButtonType{
    type?: 'link' | 'button';
    btnOnClick?: () => void;
    background?: 'mainGreen' | 'grayBlue';
    content: string;
    link?: any;
}

const Button: FC<ButtonType> = ({type = 'link', btnOnClick, background = 'mainGreen', content = '', link = ''}) => {
    if(type === 'button'){
        return (
            <button 
                className = {`btn btn-${background}`} 
                onClick = {btnOnClick}
            >
                {content}
            </button>  
        )
    } else if(type === 'link'){
        return(
            <Link 
                className = {`btn btn-${background}`} 
                to = {link}
            >
                {content}
            </Link> 
        )
    }


}

export default Button
