String rank1, rank2, rank3, rank4, rank5
String suit1, suit2, suit3, suit4, suit5
int cardNumber = 0
boolean finished = false
//while (!finished)
while (!finished) {
	println "Enter rank (1-10, J, Q or K)"
	if (cardNumber != 5) {
		if (card == 0) {
			rank1 = System.console().readLine()
			println "Enter suit (spades, hearts, diamonds, clubs)."
			suit1 = System.console().readLine()
		} else if (card == 1) {
			rank2 = System.console().readLine()
			println "Enter suit (spades, hearts, diamonds, clubs)."
			suit2 = System.console().readLine()
		} else if (card == 2) {
			rank3 = System.console().readLine()
			println "Enter suit (spades, hearts, diamonds, clubs)."
			suit3 = System.console().readLine()
		} else if (card == 3) {
			rank4 = System.console().readLine()
			println "Enter suit (spades, hearts, diamonds, clubs)."
			suit4 = System.console().readLine()
		} else if (card == 4) {
			rank5 = System.console().readLine()
			println "Enter suit (spades, hearts, diamonds, clubs)."
			suit5 = System.console().readLine()
		}
		cardNumber = cardNumber +1
	} else {
		finished = true
	}
//	System.console().readLine()
}
//if (h1.substring(0,1)<=h2.substring(0,1))

/** --------------------
want to store a set of numbers
then write these to consecutive cards

--------------------
Straight flush: 1-5,2-6,3-7,4-8,5-9,6-10,7-J,8-Q,9-K & all same suit
Flush: Any numbers & all same suit

Straight: 1-5,2-6,3-7,4-8,5-9,6-10,7-J,8-Q,9-K & any suit

Full house: 3 numbers are the same, 2 numbers the same
Two pairs: 2 numbers are same & 2 other numbers the same

Poker: 4 numbers are the same & any suit
Three of a kind: 3 numbers are the same
Pair: 2 numbers are the same

Nothing: any other situation

if(s.substring)
**/