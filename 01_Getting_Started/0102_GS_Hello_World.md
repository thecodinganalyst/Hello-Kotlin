# Hello World

Kotlin is based on java, so in order to run it, the main() method must be present

```Kotlin
fun main(){
	println("Hello World")
}
```

1. Save the above code with a .kt extension (e.g. hello_world.kt)
2. Run the below command in your terminal, and a java class file will be generated, prefixed by a _, and postfixed with Kt. (e.g. _hello_worldKt.class). A META-INF folder will also be generated, but we can ignore it for now
```bash
kotlinc hello_world.kt
```
3. You can either run it with kotlin or java
```bash
kotlin _hello_worldKt
```

```bash
java _hello_worldKt
```

The result will be the same
```bash
Hello World
```
