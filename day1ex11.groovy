String storeRank, storeSuit
int rank1, rank2, rank3, rank4, rank5
int order1, order2, order3, order4, order5
String suit1, suit2, suit3, suit4, suit5
String pokerHand = "Nothing"
int cardNumber = 0
boolean finished = false
while (!finished) {
	if (cardNumber != 5) {
		print "Enter rank (1-10, J, Q or K): "
		storeRank = System.console().readLine()
			while (storeRank != "1" && storeRank != "2" && storeRank != "3" && storeRank != "4" && storeRank != "5" && storeRank != "6" && storeRank != "7" && storeRank != "8" && storeRank != "9" && storeRank != "10" && storeRank != "J" && storeRank != "Q" && storeRank != "K") {
				print "Not a valid rank, try again: "
				storeRank = System.console().readLine()
			}
// Converting values J, Q and K to values that will run in numerical order.
			if (storeRank == "J") {
				storeRank = "11"
			} else if (storeRank == "Q") {
				storeRank = "12"
			} else if (storeRank == "K") {
				storeRank = "13"
			}
			print "Enter suit (spades, hearts, diamonds, clubs): "
			storeSuit = System.console().readLine()
			while (storeSuit != "spades" && storeSuit != "hearts" && storeSuit != "diamonds" && storeSuit != "clubs") {
				print "Not a valid suit, try again: "
				storeSuit = System.console().readLine()
			}
		if (cardNumber == 0) {
			rank1 = Integer.parseInt(storeRank)
			suit1 = storeSuit
		} else if (cardNumber == 1) {
			rank2 = Integer.parseInt(storeRank)
			suit2 = storeSuit
		} else if (cardNumber == 2) {
			rank3 = Integer.parseInt(storeRank)
			suit3 = storeSuit
		} else if (cardNumber == 3) {
			rank4 = Integer.parseInt(storeRank)
			suit4 = storeSuit
		} else if (cardNumber == 4) {
			rank5 = Integer.parseInt(storeRank)
			suit5 = storeSuit
		}
		cardNumber = cardNumber +1
	} else {
		finished = true
	}
}
// Sorting card ranks from lowest to highest, then assigning these values to order1-order5.
if (rank1 <= rank2 && rank1 <= rank3 && rank1 <= rank4 && rank1 <= rank5) {
	order1 = rank1
	if (rank2 <= rank3 && rank2 <= rank4 && rank2 <= rank5) {
		order2 = rank2
		if (rank3 <= rank4 && rank3 <= rank5) {
			order3 = rank3
			if (rank4 <= rank5) {
				order4 = rank4
				order5 = rank5
			}
			else {
				order4 = rank5
				order4 = rank4
			}
		}
		else if (rank4 <= rank3 && rank4 <= rank5) {
			order3 = rank4
			if (rank3 <= rank5) {
				order4 = rank3
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank3
			}
		}
		else if (rank5 <= rank3 && rank5 <= rank4) {
			order3 = rank5
			if (rank3 <= rank4) {
				order4 = rank3
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank3
			}
		}
	}
	else if (rank3 <= rank2 && rank3 <= rank4 && rank3 <= rank5) {
		order2 = rank3
		if (rank2 <= rank4 && rank2 <= rank5) {
			order3 = rank2
			if (rank4 <= rank5) {
				order4 = rank4
				order5 = rank5
			}
			else {
				order4 = rank5
				order4 = rank4
			}
		}
		else if (rank4 <= rank2 && rank4 <= rank5) {
			order3 = rank4
			if (rank2 <= rank5) {
				order4 = rank2
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank2
			}
		}
	} else if (rank4 <= rank2 && rank4 <= rank3 && rank4 <= rank5) {
		order2 = rank4
		if (rank2 <= rank3 && rank2 <= rank5) {
			order3 = rank2
			if (rank3 <= rank5) {
				order4 = rank3
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank3
			}
		}
		else if (rank3 <= rank2 && rank3 <= rank5) {
			order3 = rank3
			if (rank2 <= rank5) {
				order4 = rank2
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank2
			}
		}
		else if (rank5 <= rank2 && rank5 <= rank3) {
			order3 = rank5
			if (rank2 <= rank3) {
				order4 = rank2
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank2
			}
		}
	} else if (rank5 <= rank2 && rank5 <= rank3 && rank5 <= rank4) {
		order2 = rank5
		if (rank2 <= rank3 && rank2 <= rank4) {
			order3 = rank2
			if (rank3 <= rank4) {
				order4 = rank3
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank3
			}
		}
	}
}
// else if (rank2 is lowest)
else if (rank2 <= rank1 && rank2 <= rank3 && rank2 <= rank4 && rank2 <= rank5) {
	order1 = rank2
	if (rank1 <= rank3 && rank1 <= rank4 && rank1 <= rank5) {
		order2 = rank1
		if (rank3 <= rank4 && rank3 <= rank5) {
			order3 = rank3
			if (rank4 <= rank5) {
				order4 = rank4
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank4
			}
		}
		else if (rank4 <= rank3 && rank4 <= rank5) {
			order3 = rank4
			if (rank3 <= rank5) {
				order4 = rank3
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank3
			}
		}
		else if (rank5 <= rank3 && rank5 <= rank4) {
			order3 = rank5
			if (rank3 <= rank4) {
				order4 = rank3
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank5
			}
		}
	}
	else if (rank3 <= rank1 && rank3 <= rank4 && rank3 <= rank5) {
		order2 = rank3
		if (rank1 <= rank4 && rank1 <= rank5) {
			order3 = rank1
			if (rank4 <= rank5) {
				order4 = rank4
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank4
			}
		}
		else if (rank4 <= rank1 && rank4 <= rank5) {
			order3 = rank4
			if (rank1 <= rank5) {
				order4 = rank1
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank1
			}
		}
		else if (rank5 <= rank1 && rank5 <= rank4) {
			order3 = rank5
			if (rank1 <= rank4) {
				order4 = rank1
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank1
			}
		}
	}
	else if (rank4 <= rank1 && rank4 <= rank3 && rank4 <= rank5) {
		order2 = rank4
		if (rank1 <= rank3 && rank1 <= rank5) {
			order3 = rank1
			if (rank3 <= rank5) {
				order4 = rank3
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank3
			}
		}
		else if (rank3 <= rank1 && rank3 <= rank5) {
			order3 = rank3
			if (rank1 <= rank5) {
				order4 = rank1
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank1
			}
		}
		else if (rank5 <= rank1 && rank5 <= rank3) {
			order3 = rank5
			if (rank1 <= rank3) {
				order4 = rank1
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank1
			}
		}
	}
	else if (rank5 <=rank1 && rank5 <= rank3 && rank5 <= rank4) {
		order2 = rank5
		if (rank1 <= rank3 && rank1 <= rank4) {
			order3 = rank1
			if (rank3 <= rank4) {
				order4 = rank3
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank3
			}
		}
		else if (rank3 <= rank1 && rank3 <= rank4) {
			order3 = rank3
			if (rank1 <= rank4) {
				order4 = rank1
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank1
			}
		}
		else if (rank4 <= rank1 && rank4 <= rank3) {
			order3 = rank4
			if (rank1 <= rank3) {
				order4 = rank1
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank1
			}
		}
	}
}
else if (rank3 <= rank1 && rank3 <= rank2 && rank3 <= rank4 && rank3 <= rank5) {
	order1 = rank3
	if (rank1 <= rank2 && rank1 <= rank4 && rank1 <= rank5) {
		order2 = rank1
		if (rank2 <= rank4 && rank2 <= rank5) {
			order3 = rank2
			if (rank4 <= rank5) {
				order4 = rank4
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank4
			}
		}
		else if (rank4 <= rank2 && rank4 <= rank5) {
			order3 = rank4
			if (rank2 <= rank5) {
				order4 = rank2
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank2
			}
		}
		else if (rank5 <= rank2 && rank5 <= rank4) {
			order3 = rank5
			if (rank2 <= rank4) {
				order4 = rank2
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank2
			}
		}
	}
	else if (rank2 <= rank1 && rank2 <= rank4 && rank2 <= rank5) {
		order2 = rank2
		if (rank1 <= rank4 && rank1 <= rank5) {
			order3 = rank1
			if (rank4 <= rank5) {
				order4 = rank4
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank4
			}
		}
		else if (rank4 <= rank1 && rank4 <= rank5) {
			order3 = rank4
			if (rank1 <= rank5) {
				order4 = rank1
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank1
			}
		}
		else if (rank5 <= rank1 && rank5 <= rank4) {
			order3 = rank5
			if (rank1 <= rank4) {
				order4 = rank1
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank1
			}
		}
	}
	else if (rank4 <= rank1 && rank4 <= rank2 && rank4 <= rank5) {
		order2 = rank4
		if (rank1 <= rank2 && rank1 <= rank5) {
			order3 = rank1
			if (rank2 <= rank5) {
				order4 = rank2
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank2
			}
		}
		else if (rank2 <= rank1 && rank2 <= rank5) {
			order3 = rank2
			if (rank1 <= rank5) {
				order4 = rank1
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank1
			}
		}
		else if (rank5 <= rank1 && rank5 <= rank2) {
			order3 = rank5
			if (rank1 <= rank2) {
				order4 = rank1
				order5 = rank2
			}
			else {
				order4 = rank2
				order5 = rank1
			}
		}
	}
	else if (rank5 <= rank1 && rank5 <= rank2 && rank5 <= rank4) {
		order2 = rank5
		if (rank1 <= rank2 && rank1 <= rank4) {
			order3 = rank1
			if (rank2 <= rank4) {
				order4 = rank2
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank2
			}
		}
		else if (rank2 <= rank1 && rank2 <= rank4) {
			order3 = rank2
			if (rank1 <= rank4) {
				order4 = rank1
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank1
			}
		}
		else if (rank4 <= rank1 && rank4 <= rank2) {
			order3 = rank4
			if (rank1 <= rank2) {
				order4 = rank1
				order5 = rank2
			}
			else {
				order4 = rank2
				order5 = rank1
			}
		}
	}
}
else if (rank4 <= rank1 && rank4 <= rank2 && rank4 <= rank3 && rank4 <= rank5) {
	order1 = rank4
	if (rank1 <= rank2 && rank1 <= rank3 && rank1 <= rank5) {
		order2 = rank1
		if (rank2 <= rank3 && rank2 <= rank5) {
			order3 = rank2
			if (rank3 <= rank5) {
				order4 = rank3
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank3
			}
		}
		else if (rank3 <= rank2 && rank3 <= rank5) {
			order3 = rank3
			if (rank2 <= rank5) {
				order4 = rank2
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank2
			}
		}
		else if (rank5 <= rank2 && rank5 <= rank3) {
			order3 = rank5
			if (rank2 <= rank3) {
				order4 = rank2
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank2
			}
		}
	}
	else if (rank2 <= rank1 && rank2 <= rank3 && rank2 <= rank5) {
		order2 = rank2
		if (rank1 <= rank3 && rank1 <= rank5) {
			order3 = rank1
			if (rank3 <= rank5) {
				order4 = rank3
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank3
			}
		}
		else if (rank3 <= rank1 && rank3 <= rank5) {
			order3 = rank3
			if (rank1 <= rank5) {
				order4 = rank1
				order5 = rank5
			}
			else {
				order4 = rank5
				order5 = rank1
			}
		}
		else if (rank5 <= rank1 && rank5 <= rank3) {
			order3 = rank5
			if (rank1 <= rank3) {
				order4 = rank1
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank1
			}
		}
	}
	else if (rank3 <= rank1 && rank3 <= rank2 && rank3 <= rank5) {
		order2 = rank3
		if (rank1 <= rank2 && rank1 <= rank5) {
			order3 = rank1
		}
		else if (rank2 <= rank1 && rank2 <= rank5) {
			order3 = rank2
		}
		else if (rank5 <= rank1 && rank5 <= rank2) {
			order3 = rank5
		}
	}
	else if (rank5 <= rank1 && rank5 <= rank2 && rank5 <= rank3) {
		order2 = rank5
		if (rank1 <= rank2 && rank1 <= rank3) {
			order3 = rank1
			if (rank2 <= rank3) {
				order4 = rank2
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank2
			}
		}
		else if (rank2 <= rank1 && rank2 <= rank3) {
			order3 = rank2
			if (rank1 <= rank3) {
				order4 = rank1
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank1
			}
		}
		else if (rank3 <= rank1 && rank3 <= rank2) {
			order3 = rank3
			if (rank1 <= rank2) {
				order4 = rank1
				order5 = rank2
			}
			else {
				order4 = rank2
				order5 = rank1
			}
		}
	}
}
else if (rank5 <= rank1 && rank5 <= rank2 && rank5 <= rank3 && rank5 <= rank4) {
	order1 = rank5
	if (rank1 <= rank2 && rank1 <= rank3 && rank1 <= rank4) {
		order2 = rank1
		if (rank2 <= rank3 && rank2 <= rank4) {
			order3 = rank2
			if (rank3 <= rank4) {
				order4 = rank3
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank3
			}
		}
	}
	else if (rank2 <= rank1 && rank2 <= rank3 && rank2 <= rank4) {
		order2 = rank2
		if (rank1 <= rank3 && rank1 <= rank4) {
			order3 = rank1
			if (rank3 <= rank4) {
				order4 = rank3
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank3
			}
		}
	}
	else if (rank3 <= rank1 && rank3 <= rank2 && rank3 <= rank4) {
		order2 = rank3
		if (rank1 <= rank2 && rank1 <= rank4) {
			order3 = rank1
			if (rank2 <= rank4) {
				order4 = rank2
				order5 = rank4
			}
			else {
				order4 = rank4
				order5 = rank2
			}
		}
	}
	else if (rank4 <= rank1 && rank4 <= rank2 && rank4 <= rank3) {
		order2 = rank4
		if (rank1 <= rank2 && rank1 <= rank3) {
			order3 = rank1
			if (rank2 <= rank3) {
				order4 = rank2
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank2
			}
		}
		else if (rank2 <= rank1 && rank2 <= rank3) {
			order3 = rank2
			if (rank1 <= rank3) {
				order4 = rank1
				order5 = rank3
			}
			else {
				order4 = rank3
				order5 = rank1
			}
		}
		else if (rank3 <= rank1 && rank3 <= rank2) {
			order3 = rank3
			if (rank1 <= rank2) {
				order4 = rank1
				order5 = rank2
			}
			else {
				order4 = rank2
				order5 = rank1
			}
		}
	}
}
int matchingA = 0
if (order1 == order2) {
	matchingA++
}
if (order1 == order3) {
	matchingA++
}
if (order1 == order4) {
	matchingA++
}
if (order1 == order5) {
	matchingA++
}
if (order2 == order3) {
	matchingA++
}
if (order2 == order4) {
	matchingA++
}
if (order2 == order5) {
	matchingA++
}
if (order3 == order4) {
	matchingA++
}
if (order3 == order5) {
	matchingA++
}
if (order4 == order5) {
	matchingA++
}
// code to count if there are 2 matching \/
int matchingB = 0
if (order1 == order2 && order1 != order3 && order1 != order4 && order1 != order5) {
	matchingB = 2
} else if (order1 == order3 && order1 != order2 && order1 != order4 && order1 != order5) {
	matchingB = 2
} else if (order1 == order4 && order1 != order2 && order1 != order3 && order1 != order5) {
	matchingB = 2
} else if (order1 == order5 && order1 != order2 && order1 != order3 && order1 != order4) {
	matchingB = 2
} else if (order2 == order3 && order2 != order1 && order2 != order4 && order2 != order5) {
	matchingB = 2
} else if (order2 == order4 && order2 != order1 && order2 != order2 && order2 != order3) {
	matchingB = 2
} else if (order2 == order5 && order2 != order1 && order2 != order3 && order2 != order4) {
	matchingB = 2
} else if (order3 == order4 && order3 != order1 && order3 != order2 && order3 != order5) {
	matchingB = 2
} else if (order3 == order5 && order3 != order1 && order3 != order2 && order3 != order4) {
	matchingB = 2
} else if (order4 == order5 && order4 != order1 && order4 != order2 && order4 != order3) {
	matchingB = 2
}
if (suit1 == suit2 && suit1 == suit3 && suit1 == suit4 && suit1 == suit5) {
	if (order1+1 == order2 && order2+1 == order3 && order3+1 == order4 && order4+1 == order5) {
		pokerHand = "a Straight Flush"
	} else {
		pokerHand = "a Flush"
	}
}
else if (matchingA > 2)
{
	if (matchingA >= 4) {
		if (matchingB == 2) {
			pokerHand = "Full house"
		}
		else {
			pokerHand = "Poker"
		}
	}
//If 4 cards of same suit entered, result would be Flush, but the above will change it to higher ranking "Poker"
	if (matchingA == 3) {
		pokerHand = "Three of a kind"
		if (matchingB == 2) {
			pokerHand = "Full house"
		}
	}
	if (matchingB == 2 && matchingA != 2) {
		if (matchingA == 3) {
			pokerHand = "Full house"
		}
	}
	else if (matchingA == 2 && matchingB == 2) {
		pokerHand = "Two pairs"
	}
	else if (matchingA == 2 ^ matchingB == 2) {
		pokerHand = "Pair"
	}
}
else if ((order1+1) == order2 && (order2+1) == order3 && (order3+1) == order4 && (order4+1) == order5) {
	pokerHand = "Straight"
}
println "You got " + pokerHand
/** Straight flush: 1-5,2-6,3-7,4-8,5-9,6-10,7-J,8-Q,9-K & all same suit
Poker: 4 numbers are the same & any suit
Flush: Any numbers & all same suit
Full house: 3 numbers are the same, 2 numbers the same
Straight: 1-5,2-6,3-7,4-8,5-9,6-10,7-J,8-Q,9-K & any suit
Three of a kind: 3 numbers are the same
Two pairs: 2 numbers are same & 2 other numbers the same
Pair: 2 numbers are the same
Nothing: any other situation **/