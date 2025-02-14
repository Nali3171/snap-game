import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addCardToHandOfPlayer(Card card){
        hand.add(card);
    }
    public Card removeCardFromHand() {
        if (!hand.isEmpty()) {
            return hand.removeFirst(); // Remove the first card from the hand
        }
        return null;
    }
    public ArrayList<Card> getHand() {
        return hand;
    }
}
