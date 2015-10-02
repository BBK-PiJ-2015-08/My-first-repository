String c1, c2, c3, c4, c5
String hand1, hand2, hand3, hand4, hand5
int cardNumber = 0
boolean finished = false
//while (!finished)
while (!finished) {
	println "Enter card rank (1-10, J, Q or K) and suit (spades, hearts, diamonds, clubs) in format '1hearts'."
	if (cardNumber != 5) {
		if (card == 0) {
			cardNumber = cardNumber +1
		} else if (card == 1) {
			cardNumber = cardNumber +1
		} else if (card == 2) {
			cardNumber = cardNumber +1
		} else if (card == 3) {
			cardNumber = cardNumber +1
		} else if (card == 4) {
			cardNumber = cardNumber +1
		}
	} else {
		finished = true
	}
//	System.console().readLine()
}

--------------------
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