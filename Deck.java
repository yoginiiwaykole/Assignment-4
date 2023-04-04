import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    // Declare an ArrayList of Card objects
    private ArrayList<Card> cards;

    // Constructor to create a new deck of cards
    public Deck() {
        createDeck(); // Call the createDeck method to fill the ArrayList with cards
    }

    // Method to fill the ArrayList with cards
    public void createDeck() {
        cards = new ArrayList<Card>(); // Initialize the ArrayList

        // Create arrays for the suits and ranks
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Nested loop to create all 52 cards and add them to the ArrayList
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank)); // Add a new Card object with the current suit and rank
            }
        }
    }

    // Method to print all the cards in the deck
    public void printDeck() {
        for (Card card : cards) {
            card.printCard(); // Call the printCard method for each card in the ArrayList
        }
    }

    // Method to find a specific card in the deck
    public Card findCard(String suit, String rank) {
        for (Card card : cards) {
            if (card.getSuit().equals(suit) && card.getRank().equals(rank)) {
                return card; // If the card is found, return it
            }
        }
        return null; // If the card is not found, return null
    }

    // Method to deal a specific number of cards from the deck
    public ArrayList<Card> dealCards(int numCards) {
        ArrayList<Card> dealtCards = new ArrayList<Card>(); // Create a new ArrayList to hold the dealt cards
        for (int i = 0; i < numCards; i++) {
            dealtCards.add(cards.remove(0)); // Remove the first card from the deck and add it to the dealtCards ArrayList
        }
        return dealtCards; // Return the ArrayList of dealt cards
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(cards); // Use the shuffle method from the Collections class to shuffle the cards in the ArrayList
    }
}