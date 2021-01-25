# String Template

Variables can be used in strings, prefixed with $

Properties can be accessed via ${object.property} convention. 

```Kotlin
fun main(){
	//val declares an immutable variable
	//the type can be implied based on the value
	val user = "Dennis"
	println("Hello $user")
	println("There are ${user.length} characters in your name")
}
```

Result:

```Bash
Hello Dennis
There are 6 characters in your name
```
