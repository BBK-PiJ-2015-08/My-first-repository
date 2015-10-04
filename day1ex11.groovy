String storage
int rank1, rank2, rank3, rank4, rank5
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
// Converting values J, Q and K to values that will run in numerical order.
			if (storage == "J") {
				storage = "11"
			} else if (storage == "Q") {
				storage = "12"
			} else if (storage == "K") {
				storage = "13"
			}
			rank1 = Integer.parseInt(storage)
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

if 

else if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5) {
	pokerHand "Flush"
}

//if rank1 littler than all the others, assign it to order1. within this, if rank2 next littlest, assign to order2
/** 
if (rank1 <= rank2) {
	if (rank1 <= rank3) {
		if (rank1 <= rank4) {
			if (rank1 <= rank5) {
				order1 = rank1
			} else if (rank5 <= rank1) {
				order1 = rank5
			}
		}
	}
} 
-------

if (rank1 <= rank2 && rank1 <= rank3 && rank1 <= rank4 && rank1 <= rank5) {
	order1 = rank1
	if (rank2 <= rank3 && rank2 <= rank4 && rank2 <= rank5) {
		order2 = rank2
		if (rank3 <= rank4 && rank3 <= rank5) {
			order3 = rank3
			if (rank4 <= rank5) {
				order4 = rank4
				order5 = rank5
			} else if (rank5 <= rank4) {
				order4 = rank5
				order5 = rank4
			}
		} else if (rank4 <= rank3 && rank4 <= rank5) {
			order3 = rank4
			if (rank3 <= rank5) {
				order4 = rank3
				order5 = rank5
			} else if (rank5 <= rank3) {
				order4 = rank5
				order5 = rank3
			}
		} else if (rank5 <= rank3 && rank5 <= rank4) {
			order3 = rank5
			if (rank3 <= rank4) {
				order4 = rank3
				order5 = rank4
			} else if (rank4 <= rank3) {
				order4 = rank4
				order5 = rank3
			}
		}
	} else if (rank3 <= rank2 && rank3 <=rank4 && rank3 <= rank5) {
		order2 = rank3
		if (rank2 <= rank4 && rank2 <= rank5) {
			order3 = rank2
			if (rank4 <= rank5) {
				order4 = rank4
				order5 = rank5
			} else if (rank5 <= rank4) {
				order4 = rank5
				order5 = rank4
			}
		} else if ()
	}
}
//end of Rank1 littlest loop.
**/

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