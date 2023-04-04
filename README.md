# Assignment-4

Card Class The Card class represents a single playing card, with a suit and a rank. It has the following methods:

Card(String suit, String rank): a constructor that takes a suit and a rank and creates a new card object. getSuit(): returns the suit of the card. getRank(): returns the rank of the card. printCard(): prints the card in the format "rank of suit". sameSuit(Card otherCard): returns true if the card has the same suit as another card. sameRank(Card otherCard): returns true if the card has the same rank as another card. Deck Class The Deck class represents a deck of cards. It has the following methods:

Deck(): a constructor that creates a new deck of 52 cards. createDeck(): creates a new deck of cards by iterating through all possible combinations of suit and rank. printDeck(): prints the entire deck of cards. findCard(String suit, String rank): finds a specific card in the deck by suit and rank. dealCards(int numCards): deals a specified number of cards from the top of the deck. shuffleDeck(): shuffles the deck of cards randomly. Main Class The Main class contains the main method for the program, which creates a new deck, prints it, finds a specific card, deals a hand of cards, shuffles the deck, and prints it again.

Usage To use the program, simply run the Main class. It will create a new deck of cards and perform various operations on it, such as printing, finding, dealing, and shuffling cards.
