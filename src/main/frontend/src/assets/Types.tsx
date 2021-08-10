export interface ButtonType{
    type: 'link' | 'button';
    btnOnClick?: () => void;
    background: 'green' | 'blue';
    content: string;
    link?: any;
}