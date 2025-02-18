import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    final ArrayList<Card> deckOfCards;
    private String name;



    private static final String[] Suits = {"♥", "♠", "♦", "♣"}; //Array for suit
    private static final String[] Symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; //array for symbol

    //constructor
    public CardGame(String name) {
        this.deckOfCards = new ArrayList<>();
        this.name = name;
        createDeck();
    }

//Methods

//method for making deck
void createDeck(){
        for (String suit : Suits){
            for (String symbol : Symbols) {
                int value = getValueFromSymbol(symbol);
                deckOfCards.add(new Card(suit, symbol, value));

            }
        }
    }

    // Get numeric value from the symbol
    private int getValueFromSymbol(String symbol) {
        switch (symbol) {
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": return 10;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "A": return 14;
            default: return 0;
        }
    }

    //Method for dealing card from top of deck
    public Card dealCard(){
        if (deckOfCards.isEmpty()){
            System.out.println("No more cards to deal");
            return null;
        }
        return deckOfCards.removeFirst();
    }

    //sortDeckIntoNumbers() method here - use lambda operator to make it simpler
    public ArrayList<Card> sortDeckIntoNumbers(){
        Collections.sort(deckOfCards, (c1, c2) -> Integer.compare(c1.getValue(), c2.getValue()));
        return deckOfCards;
    }//trying as a lambda function

    //sortDeckIntoSuits method
    public ArrayList<Card> sortDeckIntoSuits(){
        Collections.sort(deckOfCards, (c1, c2) -> {
            int compareSuit = c1.getSuit().compareTo(c2.getSuit());
            if (compareSuit != 0){
                return compareSuit;
            }
            return Integer.compare(c1.getValue(), c2.getValue());
        });
        return deckOfCards;
    }

    //shuffle deck method
    public ArrayList<Card> shuffleDeck(){
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }


    //method for getDeck()
    public void getDeck(){
        for(Card card : deckOfCards){
            System.out.println(card);
        }
    }
}