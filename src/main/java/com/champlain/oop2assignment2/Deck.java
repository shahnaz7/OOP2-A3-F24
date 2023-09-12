import java.util.ArrayList;
import java.util.List;

public class Deck implements CardSource {
    List<Card> aCards = new ArrayList<Card>();

    public void shuffle() {

    }

    public Card draw() {
        int last = this.aCards.size()-1;
        Card myCard = this.aCards.get(last);
        this.aCards.remove(last);
        return myCard;

    }

    public boolean isEmpty() {
        return this.aCards.isEmpty();
    }
}
