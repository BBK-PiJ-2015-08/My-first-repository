String input = ""
int p1score, p2score = 0
println "To enter 2 players' rock paper scissors moves, use the options PP, PR, PS, RP, RR, RS, SP, SR or SS."
while (p1score-4 != p2score && p2score-4 != p1score) {
	println "Enter an option: "
	input = System.console().readLine()
	if (input == "PR") {
		p1score = p1score+1
	} else if (input == "PS") {
		p2score = p2score+1
	} else if (input == "RP") {
		p2score = p2score + 1
	} else if (input == "RS") {
		p1score = p1score + 1
	} else if (input == "SP") {
		p1score = p1score + 1
	} else if (input == "SR") {
		p2score = p2score + 1
	}
}
println "Player 1's score is " + p1score
println "Player 2's score is " + p2score