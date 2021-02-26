open class Item(val name:String, val price:Int)
class Noodles: Item("Noodles", 10){
	override fun toString():String{
		return name
	}
}
class Vagetables(val topping1:String,
				 val topping2:String,
				 val topping3:String,
) :Item("Vagetables", 15){
	override fun toString():String{
		return name
	}
}
fun main() {
	val noodies = Noodles()
	val vegetables = Vagetables("Cabbages","Sprouts","Onion")
	println(noodies)
	println(vegetables)
	
}