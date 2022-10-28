package extensionfunctions

open class Car

class Convertible: Car()

// defining the getType() extensions function on Car
fun Car.getType() = "Generic car"
// defining the getType() extensions function on Convertible
fun Convertible.getType() = "Convertible car"


fun getCarType(car: Car) : String {
    return car.getType()
}

fun getConvertibleType(convertible: Convertible) : String {
    return convertible.getType()
}


fun main() {
    print(getConvertibleType(Convertible()))
}