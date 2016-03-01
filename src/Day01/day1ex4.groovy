package Day01

boolean result = true
println "Enter a number"
String str = System.console().readLine()
int i = Integer.parseInt(str)
int j = i-1
while (j>1) {
	if (i%j == 0) {
		result = false
	}
	j--
}
if (result) {
	println "Your number, " + i + ", is a prime number."
} else {
	println "Your number, " + i + ", is not a prime number."
}