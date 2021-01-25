# Arrays

Arrays can be created by instantiating an `Array` class, passing in the size and the function that can return the initial value of each element by the index.

```kotlin
val sample = Array(5) { i -> i * 5 }
println("Define array by size and function: ")
sample.forEach { println(it) }
```

> Note that the last parameter is outside the parameter brackets `(...)` with Kotlin's `Trailing Lambda` convention

> Note the `it` is a Kotlin convention to reference the current item in a loop

Result:
```bash
Define array by size and function:
0
5
10
15
20
```

## Other shortcut ways to create arrays

### 1. Creating a list of values - `arrayOf`

```kotlin
var mutableArray = arrayOf("a", "b", "c")
mutableArray[2] = "d"
println("Array: ")
mutableArray.forEach { println(it) }
```

Result:
```shell
Array:
a
b
d
```

> Arrays are mutable by default

> But the size cannot be increased/decreased

### 2. Creating arrays of primitive types - `<Type>Array(size)`

> Applicable for Byte, Short, Int, Long, Float, Double, Boolean, Char

**a. Size of array**
```kotlin
var intArray = IntArray(3)
println("Primitive Arrays (Default 0): ")
intArray.forEach { println(it) }
```

Result:

```shell
Primitive Arrays (Default 0):
0
0
0
```

**b. Size of array and Default value**
```kotlin
intArray = IntArray(3) { 9 }
println("Primitive Arrays (Default provided): ")
intArray.forEach { println(it) }
```

Result:
```shell
Primitive Arrays (Default provided):
9
9
9
```

**c. Size of array and function to initialize values**

```kotlin
intArray = IntArray(3) { it * 1 }
println("Primitive Arrays (Default by function): ")
intArray.forEach { println(it) }
```

Result:
```shell
Primitive Arrays (Default by function):
0
1
2
```

### 3. Initializing each value - `<type>ArrayOf(<List of Values>)`

> Note the convention is camelCase instead of PascalCase

```kotlin
intArray = intArrayOf(1, 2, 3)
println("Primitive Arrays: ")
intArray.forEach { println(it) }
```

Result:
```shell
Primitive Arrays:
1
2
3
```