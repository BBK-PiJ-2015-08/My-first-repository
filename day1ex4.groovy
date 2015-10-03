> Use Boolean

String result = "is"
println "Enter a number"
String str = System.console().readLine()
int i = Integer.parseInt(str)
int j = i-1
while (j>1) {
	if (i%j == 0) {
		result = "is not"
	}
	j--
}
println "Your number " + result + " a prime number."