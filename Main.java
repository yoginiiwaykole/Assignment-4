import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // create a new Deck object
        Deck deck = new Deck();

        // print the entire deck
        deck.printDeck();

        System.out.println();

        // find a specific card in the deck and print it
        Card card = deck.findCard("Spades", "Ace");
        if (card != null) {
            card.printCard();
        } else {
            System.out.println("Card not found.");
        }

        System.out.println();

        // deal 5 cards and print them
        ArrayList<Card> hand = deck.dealCards(5);
        for (Card dealtCard : hand) {
            dealtCard.printCard();
        }

        System.out.println();

        // shuffle the deck and print it again
        deck.shuffleDeck();
        deck.printDeck();
    }
}
