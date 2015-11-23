int n1, n2
int quotient = 0
int remainder = 0
println "Enter a number"
String str = System.console().readLine()
String str0 = str
n1 = Integer.parseInt(str)
println "Enter another number"
str = System.console().readLine()
n2 = Integer.parseInt(str)
if (n2>n1) {
	remainder = n1
}
while (n1>0 && n1>=n2) {
	quotient = quotient + 1
	n1 = n1-n2
	if (n1>0 && n1<n2) {
		remainder = n1
	}
	if (n1<0) {
		remainder = 0-n1
	}
}
println str0 + " divided by " + n2 + " is " + quotient + ", remainder " + remainder