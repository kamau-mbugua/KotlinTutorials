fun main(){
	//A collection is a group of related items
	val numbers = listOf(0,3,8,4,0,5,5,8,9,2)
	println("List: ${numbers}")
	println("List size: ${numbers.size}")
	println("Sorted List: ${numbers.sorted()}")
	
	// a set. It's a group of related items, but unlike a list,
	//there can't be any duplicates,
	// and the order doesn't matter
	
	val setOfNumbers = numbers.toSet()
	println("set: ${setOfNumbers}")
	
	//Mutable Set
	
	val set1 = setOf(1,2,3)
	val set2= mutableSetOf(3,2,1)
	
	println("$set1 == $set2: ${set1 == set2}")
	
}