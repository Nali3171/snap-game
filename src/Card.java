public class Card {
        String suit;
        String symbol;
        int value;

        public Card(String suit, String symbol, int value){
            this.suit = suit;
            this.symbol = symbol;
            this.value = value;
        }
        // Add getters here:
    public String getSuit(){
            return suit;
        }
        public String getSymbol(){
            return symbol;
        }
        public int getValue(){
            return value;
        }

        //add a method called toString()
      //  public String toString(){
     //       return symbol + " of "+ suit;
      //  }

    }

