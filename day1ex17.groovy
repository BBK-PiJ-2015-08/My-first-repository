print "Enter a number: "
boolean result = true
String str = System.console().readLine()
int userInput = Integer.parseInt(str)
int dividedBy = userInput - 1
while (dividedBy>1) {
	if (userInput&dividedBy == 0) {
		result = false
	}
	dividedBy--
}
if (result) {
	println "Your number, " + i + ", is a prime number."
}
else 
if (result == false)
if (++)

if ((upper - userInput) = (lower - userInput)) {
	println "The closest two prime numbers are" + upper + " and " + lower
} else if ((upper - userInput) < (lower - userInput)) {
	println "The closest prime number is " + upper
} else {
	println "The closest prime number is " + lower
}