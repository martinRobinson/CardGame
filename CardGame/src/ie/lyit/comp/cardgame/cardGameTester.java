package ie.lyit.comp.cardgame;

public class cardGameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deck myDeck = new deck();
		myDeck.printAllCards();
		myDeck.shuffle();
		card aCard = myDeck.drawCardAtPosition(10);
		System.out.println("Card at position 10 " + aCard.toString());

	}

}
