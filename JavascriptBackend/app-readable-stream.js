const fs = require('fs')

const readbleStream = fs.createReadStream('./article.txt', {
    highWaterMark: 20
})

readbleStream.on('readable', () => {
    try {
        process.stdout.write(`[${readbleStream.read()}]`)
    } catch (error) {
        
    }
})

readbleStream.on('end', () => {
    console.log('Done')
})