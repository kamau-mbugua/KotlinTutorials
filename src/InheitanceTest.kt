import kotlin.math.PI

fun main() {

    val squareCabin1 = SquareCabin1(6, 50.0)
    val roundHut1 = RoundHut1(3, 10.0)
    val roundTower1 = RoundTower1(4, 15.5)

    with(squareCabin1) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }

    with(roundHut1) {
        println("\nRound Hut\n=========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }

    with(roundTower1) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        println("Floor area: ${floorArea()}")
    }
 }


abstract class Dwelling1(private var residents: Int) {

    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residents < capacity
}

    abstract fun floorArea(): Double
}


class SquareCabin1(residents: Int, 
    val length: Double) : Dwelling1(residents) {
   
    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double {
       return length * length
    }
}


open class RoundHut1(val residents: Int, 
    val radius: Double) : Dwelling1(residents) {
   
    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }
}


class RoundTower1(residents: Int, radius: Double, 
    val floors: Int = 2) : RoundHut1(residents, radius) {

    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}