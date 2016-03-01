package Day01

int numGuesses = 1
int yourGuess
int numberToGuess = Math.abs(1000 * Math.random())
println "Try to guess my number!"
print "Tell me a number: "
String storage = System.console().readLine()
yourGuess = Integer.parseInt(storage)
while (yourGuess != numberToGuess) {
	if (numberToGuess > yourGuess) {
		println "No! My number is higher."
	} else {
		println "No! My number is lower."
	}
	print "Tell me a number: "
	storage = System.console().readLine()
	yourGuess = Integer.parseInt(storage)
	numGuesses = numGuesses + 1
}
println "You needed " + numGuesses + " guesses."