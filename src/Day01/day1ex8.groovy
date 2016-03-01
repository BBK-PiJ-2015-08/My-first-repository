package Day01

int largest = -1
int thisnum = 0
boolean finished = false
while (!finished) {
	println "Enter a number"
	String str = System.console().readLine()
	thisnum = Integer.parseInt(str)
	if (thisnum != -1) {
		if (thisnum>largest) {
			largest = thisnum
		}
	}
	else {
	finished = true
	}
}
println "The largest number was " + largest + "."