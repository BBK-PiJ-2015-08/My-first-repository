for (i=2; i<1001; i++) {
	boolean result = true
	int j = i-1
	while (j>1) {
		if (i%j == 0) {
			result = false
		}
		j--
	}
	if (result == true) {
	println i + " is a prime number."
	} else {
		println i + " is not a prime number."
	}
}