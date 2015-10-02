String storage
String rank1, rank2, rank3, rank4, rank5
String suit1, suit2, suit3, suit4, suit5
String order1, order2, order3, order4, order5
String pokerHand = "Nothing"
int cardNumber = 0
boolean finished = false
while (!finished) {
	if (cardNumber != 5) {
		print "Enter rank (1-10, J, Q or K): "
		if (cardNumber == 0) {
			storage = System.console().readLine()
			while (storage != "1" && storage != "2" && storage != "3" && storage != "4" && storage != "5" && storage != "6" && storage != "7" && storage != "8" && storage != "9" && storage != "10" && storage != "J" && storage != "Q" && storage != "K") {
				print "Not a valid rank, try again: "
				storage = System.console().readLine()
			}
			rank1 = storage
// Converting values 10, J, Q and K to values that will run in alphanumerical order.
			if (rank1 == "10") {
				rank1 = "A"
			} else if (rank1 == "J") {
				rank1 = "B"
			} else if (rank1 == "Q") {
				rank1 = "C"
			} else if (rank1 == "K") {
				rank1 = "D"
			}
			print "Enter suit (spades, hearts, diamonds, clubs): "
			storage = System.console().readLine()
			while (storage != "spades" && storage != "hearts" && storage != "diamonds" && storage != "clubs") {
				print "Not a valid suit, try again: "
				storage = System.console().readLine()
			}
			suit1 = storage
		} else if (cardNumber == 1) {
			storage = System.console().readLine()
			while (storage != "1" && storage != "2" && storage != "3" && storage != "4" && storage != "5" && storage != "6" && storage != "7" && storage != "8" && storage != "9" && storage != "10" && storage != "J" && storage != "Q" && storage != "K") {
				print "Not a valid rank, try again: "
				storage = System.console().readLine()
			}
			rank2 = storage
			print "Enter suit (spades, hearts, diamonds, clubs): "
			storage = System.console().readLine()
			while (storage != "spades" && storage != "hearts" && storage != "diamonds" && storage != "clubs") {
				print "Not a valid suit, try again: "
				storage = System.console().readLine()
			}
			suit2 = storage
		} else if (cardNumber == 2) {
			storage = System.console().readLine()
			while (storage != "1" && storage != "2" && storage != "3" && storage != "4" && storage != "5" && storage != "6" && storage != "7" && storage != "8" && storage != "9" && storage != "10" && storage != "J" && storage != "Q" && storage != "K") {
				print "Not a valid rank, try again: "
				storage = System.console().readLine()
			}
			rank3 = storage
			print "Enter suit (spades, hearts, diamonds, clubs): "
			storage = System.console().readLine()
			while (storage != "spades" && storage != "hearts" && storage != "diamonds" && storage != "clubs") {
				print "Not a valid suit, try again: "
				storage = System.console().readLine()
			}
			suit3 = storage
		} else if (cardNumber == 3) {
			storage = System.console().readLine()
			while (storage != "1" && storage != "2" && storage != "3" && storage != "4" && storage != "5" && storage != "6" && storage != "7" && storage != "8" && storage != "9" && storage != "10" && storage != "J" && storage != "Q" && storage != "K") {
				print "Not a valid rank, try again: "
				storage = System.console().readLine()
			}
			rank4 = storage
			print "Enter suit (spades, hearts, diamonds, clubs): "
			storage = System.console().readLine()
			while (storage != "spades" && storage != "hearts" && storage != "diamonds" && storage != "clubs") {
				print "Not a valid suit, try again: "
				storage = System.console().readLine()
			}
			suit4 = storage
		} else if (cardNumber == 4) {
			storage = System.console().readLine()
			while (storage != "1" && storage != "2" && storage != "3" && storage != "4" && storage != "5" && storage != "6" && storage != "7" && storage != "8" && storage != "9" && storage != "10" && storage != "J" && storage != "Q" && storage != "K") {
				print "Not a valid rank, try again: "
				storage = System.console().readLine()
			}
			rank5 = storage
			print "Enter suit (spades, hearts, diamonds, clubs): "
			storage = System.console().readLine()
			while (storage != "spades" && storage != "hearts" && storage != "diamonds" && storage != "clubs") {
				print "Not a valid suit, try again: "
				storage = System.console().readLine()
			}
			suit5 = storage
		}
		cardNumber = cardNumber +1
	} else {
		finished = true
	}
}
//if rank1 littler than all the others, assign it to order1. within this, if rank2 next littlest, assign to order2
//this will break with 10, or Q between J and K
//if (rank1 <= )

if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5) {
	println "All the same"
//	if 
}

//if (h1.substring(0,1)<=h2.substring(0,1))

/** ---------------
>> Straight flush: 1-5,2-6,3-7,4-8,5-9,6-10,7-J,8-Q,9-K & all same suit
Poker: 4 numbers are the same & any suit
>> Flush: Any numbers & all same suit
Full house: 3 numbers are the same, 2 numbers the same
Straight: 1-5,2-6,3-7,4-8,5-9,6-10,7-J,8-Q,9-K & any suit
Three of a kind: 3 numbers are the same
Two pairs: 2 numbers are same & 2 other numbers the same
Pair: 2 numbers are the same
Nothing: any other situation

if(s.substring)
How to get s.substring to place 1-10 and J,Q,K in correct order?
10 = A
J = B
Q = C
K = D
jack
queen
king
**/