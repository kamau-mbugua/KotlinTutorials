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
	//goes through all the items for you and performs an operation on each one.
	peopleAges.forEach{print("${it.key} is ${it.value} ,")}
	
	println()
	//The map() function (which shouldn't be confused with a map or dictionary collection above)
	//applies a transformation to each item in a collection.
	
	//peopleAges.map applies a transformation to each item in peopleAges and creates a new collection of the transformed items
	println(peopleAges.map { "${it.key} is ${it.value}" } . joinToString(", "))
	//oinToString(", ") adds each item in the transformed collection to a string, separated by , and it knows not to add it to the last item
	println()
	//The filter() function returns the items in a collection that match, based on an expression.
	val filteredNames= peopleAges.filter{it.key.length <4}
	println(filteredNames)
	
	///Lamdas
	
	println()
	
	val number:Int = 5
	val tripple:(Int) -> Int = {a: Int -> a * 3/*||it * 3*/}
	println(tripple(3))
	
	//Higher-order functions
	println()
	val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
	
	println()
	
	println(peopleNames.sortedWith{str1:String, str2:String -> str1.length - str2.length})

	
	println()
	
	val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
	val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
	.shuffled()
	.take(2)
	.sorted()

	println(filteredWords)
}