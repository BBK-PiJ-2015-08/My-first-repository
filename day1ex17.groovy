print "Enter a number: "
boolean result = true
boolean resultUp = true
boolean resultDown = true
boolean upperPrimeFound = false
String str = System.console().readLine()
int userInput = Integer.parseInt(str)
int dividedBy = userInput - 1
int upper, lower
while (dividedBy>1) {
	if (userInput%dividedBy == 0) {
		result = false
	}
	dividedBy--
}
if (result) {
	println "Your number, " + userInput + ", is a prime number."
}
//for loop or while loop. store the upper number as a prime. and break;
else {
	upper = userInput + 1
	int dividedByU = upper - 1
	while (upper>1) {
		if (upper % dividedByU == 0) {
			resultUp = false
		}
		dividedByU--
	}
	if 
	lower = userInput - 1
	int dividedByD = lower - 1
	while (lower>1) {
		if (lower % dividedByD == 0) {
			resultDown = false
		}
		dividedByD--
	}

}
if (!resultUp) {
	print "resultUp is false"
}
/**
else {
	upper = userInput + 1

	int dividedByU = upper - 1
	while (dividedByU>1) {
		if (upper%dividedByU == 0) {
			resultUp = false
		}
		dividedByU--
	}
**/
//	lower = userInput - 1
//	int dividedByD = lower -1
//	while ()
/**
if (++)
// Fix the below so each bit only happens if certain booleans are true.
if ((upper - userInput) = (lower - userInput)) {
	println "The closest two prime numbers are" + upper + " and " + lower
} else if ((upper - userInput) < (lower - userInput)) {
	println "The closest prime number is " + upper
} else {
	println "The closest prime number is " + lower
}
**/