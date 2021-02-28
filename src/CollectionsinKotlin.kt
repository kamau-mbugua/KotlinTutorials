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
	
	println("contains 7: ${setOfNumbers.contains(7)}")
	
	//Mutable Set
	
	val set1 = setOf(1,2,3)
	val set2= mutableSetOf(3,2,1)
	
	println("$set1 == $set2: ${set1 == set2}")
	
	
   /*A map is a set of key-value pairs,
   //designed to make it easy to look up a value given
   // a particular key. Keys are unique, and each key
   //maps to exactly one value, but the values can have duplicates.
   //Values in a map can be strings, numbers, or objects—even another
   //collection like a list or a set.*/
	
	println()
	
	val peopleAges = mutableMapOf<String, Int>(
	"Fred" to 30,
	"Ann" to 23)
	peopleAges.put("Barnabas", 42)
	peopleAges["Joe"] =52
	peopleAges["Fred"] =31
	println(peopleAges)
	
}