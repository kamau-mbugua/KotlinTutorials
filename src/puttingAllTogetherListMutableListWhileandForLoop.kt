open class Item(val name:String, val price:Int)
class Noodles: Item("Noodles", 10){
	override fun toString():String{
		return name
	}
}
class Vagetables(vararg val toppings:String) :Item("Vagetables", 15){
	override fun toString():String{
		if(toppings.isEmpty()){
			return "$name Chef's Choice"
		}
		else{
		return name+":" + " "+ toppings.joinToString("-")
		}
		
	}
}
fun main() {
	val noodies = Noodles()
	val vegetables = Vagetables("Cabbages","Sprouts","Onion")
	val vegetables1 = Vagetables()
	println(noodies)
	println(vegetables)
	println(vegetables1)
	
}