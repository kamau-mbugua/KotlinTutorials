class Order(val orderNumber:Int){
	private val itemList = mutableListOf<Item>()
	
	fun addItem(newItem:Item){
		
		itemList.add(newItem)
		
	}
	
	fun addAll(newItems:List<Item>){
		itemList.addAll(newItems)
		
	}
	
	fun print(){
		println("Order #${orderNumber}")
		var total = 0
		for (item in itemList){
			println("${item}:KES ${item.price}")
		total += item.price
		}
		println("Total:KES ${total}")
		
	}
}
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
	
	println()
	
	
	val order1 = Order(1)
    order1.addItem(Noodles())
    order1.print()

    println()

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vagetables())
    order2.print()

    println()

    val order3 = Order(3)
    val items = listOf(Noodles(), Vagetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    order3.print()
}