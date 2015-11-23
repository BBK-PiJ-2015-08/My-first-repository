int n1, n2, n3
println "Enter a number"
String str = System.console().readLine()
int i = Integer.parseInt(str)
println "Enter another number"
str = System.console().readLine()
int j = Integer.parseInt(str)
println "Enter another number"
str = System.console().readLine()
int k = Integer.parseInt(str)
if (i<j && i<k) {
	n1 = i
	if (j<k) {
		n2 = j
		n3 = k
	} else {
		n2 = k
		n3 = j
	}
} else if (j<i && j<k) {
	n1 = j
	if (i<k) {
		n2 = i
		n3 = k
	} else {
		n2 = k
		n3 = i
	}
} else {
	n1 = k
	if (i<j) {
		n2 = i
		n3 = j
	} else {
		n2 = j
		n3 = i
	}
}
println n1 + ";" + n2 + ";" + n3