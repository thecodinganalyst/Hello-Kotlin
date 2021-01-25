# Functions

## Declaration

**fun** *FunctionName*(`Param1`:`ParamType1`, `Param2`: `ParamType2` *= SomeValue*) : `ReturnType` { ... }

Example:

```kotlin
fun main(){
	println(add(1))
	//The absent 2nd parameter will be the default value of 1
}

fun add(num1 :Int = 1, num2 :Int = 1): Int{
	return num1 + num2
}
```

Result:
```
2
```

If the return type is not provided, `Unit` will be implied as the return type. 
> `Unit` is the `void` in Java


The assignment of default values in the parameter is optional
> fun add(num1 :Int **= 1**, num2 :Int **= 2**) 