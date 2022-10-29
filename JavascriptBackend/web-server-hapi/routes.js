const routes = [
    {
        method: 'GET',
        path: '/',
        handler: (request, h) => {
            return '<h3>Welcome</h3>'
        }
    },
    {
        method: 'GET',
        path: '/users/{username}',
        handler: (request, h) => {
            const {username} = request.params
            return `<h3>Hello, ${username}. Welcome in my page </h3>`
        }
    },
    {
        method: 'GET',
        path: '/class',
        handler: (request, h) => {
            const {level, type} = request.query
            return `Search: ${level} - ${type}`
        }
    },
    {
        method: 'POST',
        path: '/login',
        handler: (request, h) => {
            const {username, password} = request.payload
            return `Welcome, ${username}`
        }
    },
    {
        method: '*',
        path: '/',
        handler: (request, h) => {
            return 'This page cannot be access';
        },
    },
    {
        method: 'GET',
        path: '/about',
        handler: (request, h) => {
            return '<p>This is My Page</p>'
        }
    },
    {
        method: '*',
        path: '/about',
        handler: (request, h) => {
            return 'This page cannot be access';
        },
    },
    {
        method: '*',
        path: '/{any*}',
        handler: (request, h) => {
            return 'This page is not found'
        }
    }
]

module.exports = routes