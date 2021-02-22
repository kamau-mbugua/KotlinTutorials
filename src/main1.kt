//val diceRange = 1..6;
//val randomNumber = diceRange.random();

val myFirstDice = Dice();
fun main(){
	println("This is a "+" "+ myFirstDice.sides + " "+"Sided Dice")
	myFirstDice.roll()
//	print("Random Number: ${randomNumber}")
	
}


class Dice{
	var sides =6
	
	fun roll(){
		val diceRange = 1..6;
		val randomNumber = diceRange.random();
		print(randomNumber)
	}
	
}