# snap-game
This is simple 2-player game created with Java. Players take turns picking cards from a deck, if two cards have same symbol the player has to type "snap" to win!

## How to Play Snap:
- Run the Game
- Payer 1 and Player 2 take turns pressing enter to draw a card from the deck
- if 2 cards have the same symbol the player should call snap
- The game will end and player wins

## Features:

- 52 cards in a deck
- shuffle and sort cards
- snap when two players are competing
- player can win by calling Snap

## Classes:
  - Card
  - CardGame
  - Player
  - snap
  - Main -> runs the game

## In Card class:
- suits(Heart, clud, spade and diamond)- String
- (2, 3, 4,....10, Q, J, K, A)
- int value ( 2- 14)
- have a toString() method
- getSuit() method for returning card's suit
- getSymbol() method to return symbol
- getValue() method for cards value
- make a constrcutor
- add getters to return specific function

## CardGame class:
  - snap string
  - array list with list of 52 cards called deckOfCards
  - create getDeck() method which will list out all cards in the deck
  - name defined in constructor (snap)
  - use for loop to get list of all cards
  - dealCard() method will deal card from top of card and remove it from deck
  - shuffle Deck() method shuffles deck of cards randomly
  - sortDeckIntoNumbers() - sorts cards by value
  - sortDeckIntoSuits - sorts deck by suit and then by card value

## Player class:
  - name of player
  - hand of player property
  - addCardToHand() method
  - removeCardFromHand() method

  ## Snap class whcih extends CardGame:
  - player 1 and player 2
  - startGame() method shuffles deck and begins game
  - takeTurn() method
  - checkSnap() metho check symbols of both cards
  - snap() method declares a winner when snap is called
