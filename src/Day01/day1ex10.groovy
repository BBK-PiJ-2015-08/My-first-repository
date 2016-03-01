package Day01

boolean consecutive = true
boolean finished = false
int num1 = -10000
int num2 = 0
while (!finished) {
	if (num2 != -1) {
		if (num2 != 0) {
		num1 = num2
		}
	}
	print "Enter a number: "
	String str = System.console().readLine()
	num2 = Integer.parseInt(str)
	if (num2 == -1) {
		finished = true	
	}
	else {
		if (num1 != -10000) {
			if (num2>num1) {
				if (num2-1 != num1) {
					consecutive = false
				}
			}
			else if (num1>num2) {
				if (num1-1 != num2) {
					consecutive = false
				}
			}
		}

	}
}
if (!consecutive) {
		println "No"
	} else {
		println "Yes"
	}