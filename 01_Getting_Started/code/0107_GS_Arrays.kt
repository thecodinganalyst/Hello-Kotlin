fun main(){

	val sample = Array(5) { i -> i * 5 }
	println("Define array by size and function: ")
	sample.forEach { println(it) }

	var mutableArray = arrayOf("a", "b", "c")
	mutableArray[2] = "d"
	println("Array: ")
	mutableArray.forEach { println(it) }

	var intArray = IntArray(3)
	println("Primitive Arrays (Default 0): ")
	intArray.forEach { println(it) }

	intArray = IntArray(3) { 9 }
	println("Primitive Arrays (Default provided): ")
	intArray.forEach { println(it) }

	intArray = IntArray(3) { it * 1 }
	println("Primitive Arrays (Default by function): ")
	intArray.forEach { println(it) }

	intArray = intArrayOf(1, 2, 3)
	println("Primitive Arrays: ")
	intArray.forEach { println(it) }

}