import kotlin.math.PI

fun main(){
	//val dweling = Dwelling()
	
	val squareCabin = SquareCabin(6, 50.0)

    println("\nSquare Cabin\n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")
	//println("Floor area: ${floorArea()}")
	
	val roundHut = RoundHut(3, 10.0)
	
	with(roundHut){
		println("\n Roud Hut\n ===========")
		println("Material: ${buildingMaterial}")
		println("Capacity: ${capacity}")
		println("Has Room?: ${hasRoom()}")
		println("Floor area: ${floorArea()}")
		
		
	}
	
	val roundTower = RoundTower(4, 15.5)
	
	with(roundTower){
		println("\n Roud Tower\n ===========")
		println("Material: ${buildingMaterial}")
		println("Capacity: ${capacity}")
		println("Has Room?: ${hasRoom()}")
		println("Floor area: ${floorArea()}")
		
		
	}
	
	
	
}

abstract class Dwelling(private var residents: Int){
	abstract val buildingMaterial: String
	abstract val capacity: Int
	
	
	
	fun hasRoom(): Boolean{
		return residents < capacity
	}
	
	abstract fun floorArea(): Double
}

class SquareCabin(residents: Int, val lengths: Double) : Dwelling(residents){
	override val buildingMaterial = "Wood"
	override val capacity = 6
	override fun floorArea():Double{
		return lengths* lengths
	}
}

open class RoundHut(residents: Int, val radius: Double): Dwelling(residents){
	override val buildingMaterial = "Straw"
	override val capacity = 4
	override fun floorArea():Double{
		return PI * radius * radius
	}
}

class RoundTower (residents: Int, radius: Double, val floors: Int =2): RoundHut(residents, radius){
	override val buildingMaterial = "Stones"
	override val capacity = 4 * floors
	
	override fun floorArea(): Double {
        return super.floorArea() * floors
    }
	
}