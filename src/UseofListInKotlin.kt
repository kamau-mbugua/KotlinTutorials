fun main(){
	val colors:List<String> = listOf("green", "orange","blue")

//	colors.add("purple")
//	colors[0] = "yellow"
	
	println("${colors}")
	println("${colors.size}")
	println("${colors.first()}")
	println("${colors.last()}")
	println("${colors.contains("pink")}")
	println("Reversed list:${colors.reversed()}")
	//println("New List after reversing is still:${colors}")
	println("Sorted list:${colors.sorted()}")
//	println("New List after sorting is:${colors}")
	

}