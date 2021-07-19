import React, { FC } from 'react'
import { ButtonType } from '../../../assets/Types'
import { Link } from 'react-router-dom';

const Button: FC<ButtonType> = ({type, background, content, link}) => {
    const btnOnclick = () => {

    }

    if(type === 'button'){
        return (
            <button 
                className = {`btn btn-${background}`} 
                onClick = {btnOnclick}
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
