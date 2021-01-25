# Variables

## Syntax
[`val`|`var`] **Name** *:Type* *= `Value`*


Example:
```kotlin
val language :String = "Kotlin"
```

| Keyword | Description                                 |
|---------|---------------------------------------------|
| val     | The value is immutable and can't be changed |
| var     | The value can be changed                    |

## Type

The type is not required if it can be derived from the value.

## Nullable Type

By default, nulls are not allowed. Add a ? suffix to the Type to make it nullable

Example:
```kotlin
val x = null
println(x)
```

Result:
```shell
null
```
