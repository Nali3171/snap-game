public class Card {
        private String suit;
        private String symbol;
        private int value;


        public Card(String suit, String symbol, int value){
            this.suit = suit;
            this.symbol = symbol;
            this.value = value;
        }
        // get
        public String getSuit(){
            return suit;
        }
        public String getSymbol(){
        return symbol;
       }
       public int getValue(){
       return value;
        }

        //method called toString()
       public String toString(){
           return symbol + " of "+ suit;
        }

    }

