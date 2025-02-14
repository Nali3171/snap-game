import com.sun.security.jgss.GSSUtil;

public class main {
    public static void main(String[] args) {

        //test for showing whole deck
        CardGame game = new CardGame("Snap");
        System.out.println("Initial Deck: ");
        game.getDeck();

        //test for shuffling deck
        game.shuffleDeck();
        System.out.println("\nShuffled Deck: ");
        game.getDeck(); // works

        //does it sort by number order
        game.sortDeckIntoNumbers();
        System.out.println("\nSorted Deck in Number Order:");
        game.getDeck(); //works

        // Sort by suits and number order
        game.sortDeckIntoSuits();
        System.out.println("\nSorted Deck by Suits and Number Order:");
        game.getDeck(); //works

        //deal cards
        Card cardDeal = game.dealCard();
        System.out.println("\nDealt card : " + cardDeal); //works



//initial test
        Card card = new Card("♥", "A", 14);
        System.out.println(card);

    }
}
