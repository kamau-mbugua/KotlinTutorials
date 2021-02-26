open class Item(val name:String, val price:Int)
class Noodles: Item("Noodles", 10)
class Vagetables :Item("Vagetables", 15)
fun main() {
	val noodies = Noodles()
	val vegetables = Vagetables()
	println(noodies)
	println(vegetables)
	
}