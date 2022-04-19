package playingcards;
import static playingcards.CardConstants.*;

public class Deck {
    private PlayingCard[] deck = new PlayingCard[52];

    public Deck() {
        for (int suitIndex = 0; suitIndex < SUITS.length; suitIndex++) {
            for (int rankIndex = 0; rankIndex < RANKS.length; rankIndex++) {
                int currentIndex = (rankIndex * 4) + suitIndex;

                String suit = SUITS[suitIndex];
                String rank = RANKS[rankIndex];

                deck[currentIndex] = new PlayingCard(rank, suit);
            }
        }
    }

    public void printDeck() {
        for (PlayingCard card : deck) {
            System.out.printf("%s of %s\n", card.getRank(), card.getSuit());
        }
    }
}
