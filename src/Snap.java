import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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

        while (!deckOfCards.isEmpty()) {
            System.out.println(player1.getName() + "'s turn. Press Enter to draw a card.");
            scanner.nextLine();

            takeTurn(player1); // Player 1's turn

            // Check if there's a snap
            if (checkSnap()) {
                snapTimer(scanner, player1, player2);
                System.out.println("SNAP! " + player1.getName() + " wins!");
                return;
            }
            if (deckOfCards.isEmpty()) {
                System.out.println("we have no cards left, Game over!");
                break;
            }

            // Switch to Player 2
            System.out.println(player2.getName() + "'s turn. Press Enter to draw a card.");
            scanner.nextLine();

            takeTurn(player2);

            if (checkSnap()) {
                snapTimer(scanner, player2, player1);
                return;
            }
            if (deckOfCards.isEmpty()) {
                System.out.println("we have no cards left, Game over!");
                break;
            }
            //switching between player, bulk of game
        }   System.out.println("Game over!");
    }//game over

    private void takeTurn(Player player) {
        Card dealtCard = dealCard();
        if (dealtCard != null) {
            System.out.println(player.getName() + " drew: " + dealtCard);
            previousCard = dealtCard; // Update the previous card
        }
    }

    private boolean checkSnap() {
        return previousCard != null && deckOfCards.size() > 0 &&
                previousCard.getSymbol().equals(deckOfCards.getFirst().getSymbol());
    }

    //implement 2 second timer
    private boolean snapCalled;
    private void snapTimer(Scanner scanner, Player currentPlayer, Player otherPlayer){
        snapCalled = false;

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(!snapCalled) {
                    System.out.println(otherPlayer.getName() + " gets a chance to type 'snap'.");
                    System.out.println(otherPlayer.getName() + ", type 'snap' to win!");

                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("snap")) {
                        System.out.println(otherPlayer.getName() + " wins the game!");
                    } else {
                        System.out.println("No snap. Game continues!");
                    }
                }
                    timer.cancel();
                }
            },2000);

            String input = scanner.nextLine();
        if(input.equals("snap")){
            snapCalled= true;
                System.out.println(currentPlayer.getName() + " wins the game");
                timer.cancel();
        }
    }

    public void snap(Player player) {
        System.out.println(player.getName() + " typed SNAP!");
        System.out.println(player.getName() + " wins the game!");
    }
}



