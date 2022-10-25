const http = require('http')

const requestListener = (request, response) => {
    response.setHeader('Content-type', 'application/json')
    response.statusCode = 200

    const { method, url } = request

    if (url === '/') {
        if (method === 'GET') {
            response.end(JSON.stringify({
                message: 'Server is running',
                code: 200
            }))
        } else {
            response.end(JSON.stringify({
                message: 'This page cannot access',
                code: 400
            }))
        }
    } else if (url === '/about') {
        if (method === 'GET') {
            response.end(JSON.stringify({
                message: 'Hello, Welcome',
                code: 200
            }))
        }
        else if(method === 'POST') {
            let body = []
    
            request.on('data', (chunk) => {
                body.push(chunk)
            })
            request.on('end', () => {
                body = Buffer.concat(body).toString();
                const { name } = JSON.parse(body)
                response.end(JSON.stringify({
                    message: `Hai, ${name}!`,
                    code: 200
                }))
            })
        } else {
            response.end(JSON.stringify({
                message: 'This page cannot access',
                code: 400
            }))
        }
    } else {
        response.end(JSON.stringify({
            message: 'Not found',
            code: 404
        }))
    }
    
}

const server = http.createServer(requestListener)

const port = 3030
const host = 'localhost'

server.listen(port, host, () => {
    console.log(`Server is running http://${host}:${port}`)
})