package Day01

String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
	i++
	str2 = System.console().readLine()
	int j = Integer.parseInt(str2)
	if (j == 0) {
	break
	} else if (j != 1) {
		println j
	}
}
System.out.println("finished")