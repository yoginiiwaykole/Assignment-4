public class Card {
    private String suit; // the suit of the card
    private String rank; // the rank of the card

    /**
     * Constructor to create a new Card object.
     * @param suit the suit of the card
     * @param rank the rank of the card
     */
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Returns the suit of the card.
     * @return the suit of the card
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Returns the rank of the card.
     * @return the rank of the card
     */
    public String getRank() {
        return rank;
    }

    /**
     * Prints the card in the format "[rank] of [suit]".
     */
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }

    /**
     * Checks if the given card is of the same suit as this card.
     * @param otherCard the card to compare with
     * @return true if the cards are of the same suit, false otherwise
     */
    public boolean sameSuit(Card otherCard) {
        return suit.equals(otherCard.getSuit());
    }

    /**
     * Checks if the given card has the same rank as this card.
     * @param otherCard the card to compare with
     * @return true if the cards have the same rank, false otherwise
     */
    public boolean sameRank(Card otherCard) {
        return rank.equals(otherCard.getRank());
    }
}