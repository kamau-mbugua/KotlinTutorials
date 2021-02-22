val age = 23;
val name = "Sam Doe";
val border = ":--:"
val commas = ","
val vartices = "|"
val equals ="="
val ats= "@"
val repetition = 20;

fun main() {
	
   printBoder(border)
    println("Happy Birthday, ${name}!")
    printBoder(border)
	println()
	println();
	printCake(commas, repetition)
	printCakeVertices(vartices)
	printCakeEquals(equals)
	printCakeAts(ats)
	printCakeAts1(ats)
	printCakeAts2(ats)
	printCakeAts3(ats)
	printCakeAts4(ats)
    /*println("\n")
    println("\n")
    
    
    println("Happy Birthday ${name}!");
    print("You are already ${age} \n");
    println("${age} is the very best age to celebrate, ${name}!");
    println("\n")
    
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")*/
    
}

fun printBoder(border: String){
     repeat(8){
         print(border);
     }
     println();
    
}

fun printCake(commas: String, repetition: Int){
	repeat(repetition){
		print(commas)
		
	}
	println();
	
}

fun printCakeVertices( vartices: String){
	repeat(20){
		
		print(vartices)
		
	}
	println();
	
}

fun printCakeEquals( equals: String){
	repeat(20){
		
		print(equals)
		
	}
	println();
	
}

fun printCakeAts( ats: String){
	repeat(20){
		
		print(ats)
	}
	println();
	
}
fun printCakeAts1( ats: String){
	repeat(20){
		
		print(ats)
	}
	println();
	
}
fun printCakeAts2( ats: String){
	repeat(20){
		
		print(ats)
	}
	println();
	
}
fun printCakeAts3( ats: String){
	repeat(20){
		
		print(ats)
	}
	println();
	
}
fun printCakeAts4( ats: String){
	repeat(20){
		
		print(ats)
	}
	println();
	
}