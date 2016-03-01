package Day01

int n1, n2
int total = 0
println "Enter a number"
String str = System.console().readLine()
n1 = Integer.parseInt(str)
println "Enter another number"
str = System.console().readLine()
n2 = Integer.parseInt(str)
while (n1>0) {
	total = total + n2
	n1--
}
println "The product of your two numbers is " + total