fun main(){
	val guestPerFamily = listOf(2,4,1,3)
	var totalGuests = 0
	var index =0
	//While Loop
	while(index < guestPerFamily.size){
		totalGuests += guestPerFamily[index]
		index++
	}
	 println("Total Guest Count: $totalGuests")
	
	for (num in guestPerFamily.sorted())
	{
		
		println(num)
	}
	//For Loop
	
	val names = listOf("Jessica", "Henry", "Alicia", "Jose")
	for(name in names.sorted()){
		println(name+" "+"Has Number a Charachers of"+" "+name.length)
	}

}