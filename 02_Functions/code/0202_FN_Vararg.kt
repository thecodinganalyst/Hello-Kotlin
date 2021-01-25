fun main(){
	println(concatenate(" ","This","is","an","example"))

	val sample = arrayOf("This", "is", "another", "sample");
	println(concatenate(" ", *sample))
}

fun concatenate(joiner: String, vararg textList: String): String {
	var result = ""
	for(text in textList){
		if(result.length > 0) result += joiner
		result = result + text
	}
	return(result)
}