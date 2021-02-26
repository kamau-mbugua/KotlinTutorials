fun main(){
	val entrees = mutableListOf<String>()
	val entree:MutableList<String> = mutableListOf()
	
	println("Entrees: $entrees")
	println("Entree: $entree")
	
	println("Add spaghetti: ${entrees.add("Noodles")}")
	println("Entrees: $entrees")
	
	println("Add spaghetti: ${entrees.add("spaghetti")}")
	println("Entrees: $entrees")
	
	//Avoid adding list one by one using code below

	val moreItems = listOf("ravioli", "Iasagna", "fettuccine")
	println("Add all Items: ${entrees.addAll(moreItems)}")
	println("Entrees: $entrees")
	
	//remove an item
	
	println("Remove spaghetti: ${entrees.remove("spaghetti")}")
	println("Entrees: $entrees")
	
	//remove an item that does not exist
	println("Remove Item: ${entrees.remove("rice")}")
	println("Entrees: $entrees")
	
	//remove at an index
	println("Add Item : ${entrees.add("fettuccine1")}")
	println("Entrees: $entrees")
	
	//clear a list
	println("${entrees.clear()}")
	println("Entrees: $entrees")
	
	// Check if the list is empty
    println("Empty? ${entree.isEmpty()}")
	
}