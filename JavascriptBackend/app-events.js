const {EventEmitter} = require('events')

const myEventMatter = new EventEmitter()

// this function will be run when event coffee-order is happening
const makeCoffee = ({name}) => {
    console.log(`Coffee ${name} has made`)
}
const billCoffee = ({price}) => {
    console.log(`Price: ${price}`)
}

// Handle 1: => One by one
console.log('Handle 1:')
// as listener event coffee-order
myEventMatter.on('coffee-order', makeCoffee)
myEventMatter.on('coffee-order', billCoffee)

// event 'coffee-order' is happening
myEventMatter.emit('coffee-order', {
    name: "Arabica", 
    price: 20000
})

// Handle 2: => Becoming one
console.log('Handle 2:')
const onCoffeeOrderedListener = ({name, price}) => {
    makeCoffee(name)
    billCoffee(price)
}
myEventMatter.on('coffee-order', onCoffeeOrderedListener)

myEventMatter.emit('coffee-order', {
    name: "Robusta",
    price: 15000
})