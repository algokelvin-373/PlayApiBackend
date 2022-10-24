const fs = require('fs')

// Handle 1
const fileReadCallback = (error, data) => {
    if (error) {
        console.log("Failed to read file")
        return
    }
    console.log(data)
}
fs.readFile('sample.txt', 'utf-8', fileReadCallback)

// Handle 2
const data2 = fs.readFileSync('sample2.txt', 'utf-8')
console.log(data2)