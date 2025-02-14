import java.util.ArrayList;
import java.util.Collections;

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

    //sortDeckIntoNumbers() method here - use lambda operator to make it simpler
    public ArrayList<String> sortDeckIntoNumbers(){
        Collections.sort((c1, c2) -> Integer.compare(c1.getValue(), c2.getValue()));
        return deckOfCards;
    }

    //sortDeckIntoSuits method
    public ArrayList<Card> sortDeckIntoSuits(){
        Collections.sort(deckOfCards, (card1, card2) ->{
            int compareSuit = card1.getSuit().compareTo(card2.getSuit());
            if (compareSuit != 0){
                return compareSuit;
            }
            return Integer.compare(card1.getValue(), card2.getValue());
        });
        return deckOfCards;
    }




//method for getDeck()
    public void getDeck(){
        for(Card card : deckOfCards){
            System.out.println(card);
        }
    }
}