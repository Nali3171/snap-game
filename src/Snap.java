import java.util.Scanner;

public class Snap extends CardGame{

    private Player player1;
    private Player player2;
    private Player previousCard;


    public Snap(String snap){
        super(snap);
        this.player1 = new Player("Player 1");
        this.player2= new Player("Player 2")
    }


    //beginning of game
    public void startGame()

    {
        createDeck();
        shuffleDeck();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Nazrins's Snap Game! Please press Enter to get a card.");

        while (!deckOfCards.isEmpty()) {
            System.out.println(player1.getName() + " turn. draw next card.");
            scanner.nextLine();

            takeNextTurn(player1);

            if (previousCard != null) {
                if (checkSnap()) {
                    System.out.println("SNAP" + player1.getName() + "wins!");
                    return;
                }
            }
        }
        System.out.println("Game over.");
    }
    }
} private void takeTurn(Player player) {
    Card dealtCard = dealCard();
    System.out.println(player.getName() + " drew: " + dealtCard);

    if (dealtCard != null) {
        previousCard = dealtCard;
    }
}
private boolean checkSnap() {
    return previousCard != null && previousCard.getSymbol().equals(deckOfCards.get(0).getSymbol());
}
}