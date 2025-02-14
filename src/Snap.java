import java.util.Scanner;

public class Snap extends CardGame{

    private final Player player1;
    private  final Player player2;
    private Card previousCard;


    public Snap(String snap){
        super(snap);
        this.player1 = new Player("Player 1");
        this.player2= new Player("Player 2");
        this.previousCard = null;
    }


    //beginning of game
    public void startGame() {
        shuffleDeck();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Nazrins's Snap Game! Please press Enter to get a card.");

        boolean gameRunning = true;
        while (gameRunning && !deckOfCards.isEmpty()) {
            System.out.println(player1.getName() + "'s turn. Press Enter to draw a card.");
            scanner.nextLine(); // Wait for player to press enter

            takeTurn(player1); // Player 1's turn

            // Check if there's a snap
            if (checkSnap()) {
                System.out.println("SNAP! " + player1.getName() + " wins!");
                return;
            }

            // Switch to Player 2
            System.out.println(player2.getName() + "'s turn. Press Enter to draw a card.");
            scanner.nextLine();

            takeTurn(player2);

            if (checkSnap()) {
                System.out.println("SNAP! " + player2.getName() + " wins!");
                return;
            }
        }    System.out.println("Game over! No more cards.");
    }
    private void takeTurn(Player player) {
        Card dealtCard = dealCard();
        if (dealtCard != null) {
            System.out.println(player.getName() + " drew: " + dealtCard);
            previousCard = dealtCard; // Update the previous card
        }
    }

    private boolean checkSnap() {
        return previousCard != null && deckOfCards.size() > 0 &&
                previousCard.getSymbol().equals(deckOfCards.get(0).getSymbol());
    }

    public void snap(Player player) {
        System.out.println(player.getName() + " typed SNAP!");
        System.out.println(player.getName() + " wins the game!");
    }
}



