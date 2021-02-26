fun main(){
	val guestPerFamily = listOf(2,4,1,3)
	var totalGuests = 0
	var index =0
	
	while(index < guestPerFamily.size){
		totalGuests += guestPerFamily[index]
		index++
	}
	 println("Total Guest Count: $totalGuests")
	println("Size of the list is: $guestPerFamily[index]")
}