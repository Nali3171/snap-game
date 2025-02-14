import java.util.ArrayList;

public class CardGame {
    private ArrayList<String> deckOfCards;
    private String name;


    //constructor
    public CardGame(String name) {
        this.deckOfCards = new ArrayList<>();
        this.name = name;
    }

    private static final String[] Suits = {"Heart", "Spade","Club", "Diamond"}; //Array for suit
    private static final String[] Symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; //array for symbol


//Make methods

//method for making deck
    private void createDeck(){
        for (String suit : Suits){
            for(i = 0; i < Symbols.length; i++){
               int value = i + 2;
               deckOfCards.add(new Card(suit,Symbols[i], value));
            }
        }
    }


//method for getDeck()
}