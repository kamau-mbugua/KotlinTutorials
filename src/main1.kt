fun main() {
    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
	val LuckyNumber = 4
	
	println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
	
	
	if(diceRoll == LuckyNumber){
		print("You Win")
		
	}else if (diceRoll == 1) {
        println("So sorry! You rolled a 1. Try again!")
    } else if (diceRoll == 2) {
        println("Sadly, you rolled a 2. Try again!")
    } else if (diceRoll == 3) {
        println("Unfortunately, you rolled a 3. Try again!")
    } else if (diceRoll == 4) {
        println("No luck! You rolled a 4. Try again!")
    } else if (diceRoll == 5) {
        println("Don't cry! You rolled a 5. Try again!")
    } else {
        println("Apologies! you rolled a 6. Try again!")
    }

	
	println()
	println()
    //println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")
	
	val mySecondDice= Dice(20)
	val rollDice = mySecondDice.roll()
	val numLucky = 18;
	
	when(rollDice){
		numLucky -> print("You Win")
		1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
		7 -> println("So sorry! You rolled a 7. Try again!")
        8 -> println("Sadly, you rolled a 8. Try again!")
        9 -> println("Unfortunately, you rolled a 9. Try again!")
        10 -> println("No luck! You rolled a 10. Try again!")
        11 -> println("Don't cry! You rolled a 11. Try again!")
        12 -> println("Apologies! you rolled a 12. Try again!")
		13 -> println("So sorry! You rolled a 13. Try again!")
        14 -> println("Sadly, you rolled a 14. Try again!")
        15 -> println("Unfortunately, you rolled a 15. Try again!")
        16 -> println("No luck! You rolled a 16. Try again!")
        17 -> println("Don't cry! You rolled a 17. Try again!")
        19 -> println("Apologies! you rolled a 19. Try again!")
		20 -> println("No luck! You rolled a 20. Try again!")
	}
//	//myFirstDice.numSides = 20
//	println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
//	
}


class Dice(val numSides:Int) {
    //var sides = 6

    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}