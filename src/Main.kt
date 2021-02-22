val age = 23;
val name = "Sam Doe";
val border = ":--:"

fun main() {
	
   printBoder(border)
    println("Happy Birthday, ${name}!")
    printBoder(border)
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