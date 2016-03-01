package Day01

boolean finished = false
int nthPrime = 0
for (i=2; i>-1; i++) {
	if (nthPrime == 1000) {
		break;
	}
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
	nthPrime = nthPrime + 1
	}
}