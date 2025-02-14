import java.util.ArrayList;

public class CardGame {
    private ArrayList<String> deckOfCards;
    private String name;



    private static final String[] Suits = {"♥", "♠", "♦", "♣"}; //Array for suit
    private static final String[] Symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; //array for symbol

    //constructor
    public CardGame(String name) {
        this.deckOfCards = new ArrayList<>();
        this.name = name;
    }

//Make methods

//method for making deck
    private void createDeck(){
        for (String suit : Suits){
            for(int i = 0; i < Symbols.length; i++){
               int value = i + 2;
               deckOfCards.add(String.valueOf(new Card(suit,Symbols[i], value)));
            }
        }
    }

    //method for dealing card from top of deck
    public String dealCard(){
        if (deckOfCards.isEmpty()){
            System.out.println("No more cards to deal");
            return null;
        }
        return deckOfCards.removeFirst();
    }



//method for getDeck()
    public void getDeck(){
        for(Card card : deckOfCards){
            System.out.println(card);
        }
    }
}