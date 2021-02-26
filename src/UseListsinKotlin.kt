fun main(){
val numbers :List<Int> = listOf(1,2,3,4,5,6,7)
	val number = listOf(1,2,3,4,5,6)
	
	println("LIST: ${numbers.size} ")
	println("LIST: "+ number.size)
	println()
	println()
	
	println("1st element: ${numbers[0]}")
	println("2nd element: ${numbers[1]}")
	println("3rd element: ${numbers[2]}")
	println("4th element: ${numbers[3]}")
	println("5th element: ${numbers[4]}")
	println("6th element: ${numbers[5]}")
	println("7th element: ${numbers[6]}")
	println()
	println()
	
	println("Last index: ${numbers.size - 1}")
	println("Last element: ${numbers[numbers.size - 1]}")
	println()
	println()
	
	println("First: ${numbers.first()}")
	println("Last: ${numbers.last()}")
	println()
	println()
	
	println("Contains 4? ${numbers.contains(4)}")
	println("Contains 7? ${numbers.contains(7)}")
	println("Contains 7? ${numbers.contains(8)}")
	println("Contains 7? ${numbers.contains(0)}")
}