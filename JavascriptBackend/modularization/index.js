const Tiger = require("./Tiger");
const Wolf = require("./Wolf");

const fighting = (Tiger, Wolf) => {
    if (tiger.strength > wolf.strength) {
        tiger.growl()
        return
    }
    if (wolf.strength > tiger.strength) {
        wolf.howl()
        return
    }
}

const tiger = new Tiger()
const wolf = new Wolf()

fighting(tiger, wolf)