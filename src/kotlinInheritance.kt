fun main(){
	//val dweling = Dwelling()
	
	val squareCabin = SquareCabin(6)

    println("\nSquare Cabin\n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")
	
	val roundHut = RoundHut(3)
	
	with(roundHut){
		println("\n Roud Hut\n ===========")
		println("Material: ${buildingMaterial}")
		println("Capacity: ${capacity}")
		println("Has Roo?: ${hasRoom()}")
		
		
	}
	
	val roundTower = RoundTower(4)
	
	with(roundTower){
		println("\n Roud Tower\n ===========")
		println("Material: ${buildingMaterial}")
		println("Capacity: ${capacity}")
		println("Has Roo?: ${hasRoom()}")
		
		
	}
	
	
}

abstract class Dwelling(private var residents: Int){
	abstract val buildingMaterial: String
	abstract val capacity: Int
	
	
	
	fun hasRoom(): Boolean{
		return residents < capacity
	}
}

class SquareCabin(residents: Int) : Dwelling(residents){
	override val buildingMaterial = "Wood"
	override val capacity = 6
}

open class RoundHut(residents: Int): Dwelling(residents){
	override val buildingMaterial = "Straw"
	override val capacity = 4
}

class RoundTower (residents: Int): RoundHut(residents){
	override val buildingMaterial = "Stones"
	override val capacity = 4
	
}