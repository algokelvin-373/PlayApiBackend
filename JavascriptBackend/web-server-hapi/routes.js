const routes = [
    {
        method: 'GET',
        path: '/',
        handler: (request, h) => {
            return '<h3>Welcome Kelvin</h3>'
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
            return '<p>This is My Page, Kelvin</p>'
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