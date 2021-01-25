# String Literals

```Kotlin
fun main(){
	val text = """
		This is a multiline string of text
		enclosed within 2 sets of triple double quotes 
		Escaped characters like \n will be shown as literal strings
		All white spaces, like tabs and newlines, will be preserved
	"""

	println(text)

	val text2 = """
		|However, you can use margin prefix
		|and append the trimMargin() function after the string to 
		|trim off the excess white spaces
		|The pipe character is the default
		|but you can use any other characters 
		|pass in the desired character in the trimMargin()
	""".trimMargin()

	println(text2)
}
```

Results
```Shell

		This is a multiline string of text
		enclosed within 2 sets of triple double quotes
		Escaped characters like \n will be shown as literal strings
		All white spaces, like tabs and newlines, will be preserved

However, you can use margin prefix
and append the trimMargin() function after the string to
trim off the excess white spaces
The pipe character is the default
but you can use any other characters
pass in the desired character in the trimMargin()
```