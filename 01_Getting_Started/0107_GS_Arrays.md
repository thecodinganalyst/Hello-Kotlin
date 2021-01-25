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

### 1. Creating a list of values - `listOf`

```kotlin
val immutableArray = listOf(1, 2, 3)
//immutableArray[2] = 4 - this will result in an error
println("Immutable Array: ")
immutableArray.forEach { println(it) }
```

Result:
```shell
Immutable Array:
1
2
3
```

### 2. Creating a mutable list of values - `mutableListOf`

```kotlin
var mutableArray = mutableListOf("a", "b", "c")
mutableArray[2] = "d"
println("Mutable Array: ")
mutableArray.forEach { println(it) }
```

Result:
```shell
Mutable Array:
a
b
d
```

### 3. Creating arrays of primitive types - applicable for Byte, Short, Int, Long, Float, Double, Boolean, Char - `<Type>Array(size)`

a. Size of array
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

b. Size of array and Default value
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

c. Size of array and function to initialize values

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

### 4. Initializing each value - `<type>ArrayOf(<List of Values>)`

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