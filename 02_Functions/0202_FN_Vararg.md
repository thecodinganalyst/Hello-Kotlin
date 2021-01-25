# Variable number of arguments (vararg)

Variable number of arguments can be allowed in function parameters, by adding the `vararg` keyword before the parameter declaration, provided it is the last parameter.

If the variable number of paramters is already in an array, it can be passed in with the **spread** operator `*` before the variable name.

```kotlin
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
```

Result
```
This is an example
This is another sample
```