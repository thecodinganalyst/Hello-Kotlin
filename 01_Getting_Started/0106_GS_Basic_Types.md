# Basic Types

The basic data types are as follows
* Byte
* Short
* Int (Default)
* Long
* Float
* Double (Default)
* Boolean
* Char
* String

### Explicit declaration of non default number types:

| Type        | Example     |
|-------------|-------------|
| Long        | 12345L      |
| Hexadecimal | 0x0F        |
| Binaries    | 0b01011110  |
| Float       | 12.34f      |

### Underscores can be used to make numbers more readable

```kotlin
val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010
```

Results:
```shell
1000000
1234567890123456
999999999
4293713502
3530134674
```
