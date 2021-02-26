open class Item(val name:String, val price:Int)
class Noodles: Item("Noodles", 10){
	override fun toString():String{
		return name
	}
}
class Vagetables :Item("Vagetables", 15){
	override fun toString():String{
		return name
	}
}
fun main() {
	val noodies = Noodles()
	val vegetables = Vagetables()
	println(noodies)
	println(vegetables)
	
}