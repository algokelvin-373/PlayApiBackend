const http = require('http')

const requestListener = (request, response) => {
    response.setHeader('Content-type', 'text/html')
    response.statusCode = 200

    const { method, url } = request

    if (url === '/') {
        if (method === 'GET') {
            response.end('<p>Server is running</p>')
        } else {
            response.statusCode = 400
            response.end(`This page cannot access`)
        }
    } else if (url === '/about') {
        if (method === 'GET') {
            response.end('<h1>Hello, Welcome</h1>')
        }
        else if(method === 'POST') {
            let body = []
    
            request.on('data', (chunk) => {
                body.push(chunk)
            })
            request.on('end', () => {
                body = Buffer.concat(body).toString();
                const { name } = JSON.parse(body)
                response.end(`<h1>Hai, ${name}!</h1>`);
            })
        } else {
            response.statusCode = 400
            response.end(`This page cannot access`)
        }
    } else {
        response.statusCode = 404
        response.end('<p>Not Found</p>')
    }
    
}

const server = http.createServer(requestListener)

const port = 3030
const host = 'localhost'

server.listen(port, host, () => {
    console.log(`Server is running http://${host}:${port}`)
})