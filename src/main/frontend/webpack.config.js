const path = require("path");

const webpack = require("webpack");

module.exports = {
    entry: "./src/index.tsx",
    mode: "development",
    module: {
        rules: [
            {
                test: /\.(js|jsx|tsx)$/,
                exclude: /(node_modules|bower_components)/,
                loader: "babel-loader",
                options: {
                    presets: ["@babel/env"]
                }
            },
            {
                test: /\.css$/,
                use: [
                    "style-loader",
                    "css-loader"
                ]
            },
            {
                test: /\.(png|svg)$/,
                loader: 'file-loader'
            }
        ]
    },
    resolve: {
        extensions: ["*", ".js", ".jsx", ".tsx"]
    },
    output: {
        path: path.resolve(__dirname, "public/dist"),
        publicPath: "/dist/",
        filename: "main.js",
        clean: true,
    },
    devServer: {
        contentBase: path.join(__dirname, "public/"),
        port: 3000,
        hotOnly: true,
        before: genMock,
    },
    plugins: [new webpack.HotModuleReplacementPlugin()]
};


function genMock(app, server, compiler) {
    app.get("/ping", (req, res) => {
        res.status(200).end();
    })
}
