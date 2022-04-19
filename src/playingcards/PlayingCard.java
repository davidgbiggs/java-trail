package playingcards;
import java.util.Arrays;
import java.util.HashSet;

public class PlayingCard {
    private static final HashSet<String> rankSet = new HashSet<>(Arrays.asList(CardConstants.RANKS));
    private static final HashSet<String> suitSet = new HashSet<>(Arrays.asList(CardConstants.SUITS));

    private final String suit;
    private final String rank;

    public PlayingCard(String rank, String suit) {
        assert (rankSet.contains(rank));
        assert (suitSet.contains(suit));

        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
