package ie.lyit.comp.cardgame;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ie.lyit.comp.cardgame.elements.card;
import ie.lyit.comp.cardgame.elements.deck;

public class deckTest {
	deck testDeck;

	@Before
	public void setUp() throws Exception {
		testDeck = new deck();
	}

	@Test
	public void testFullDeckOfCards() {
		assertEquals(52, testDeck.getCardCount());
	}

	@Test
	public void testDrawKnownCard() {
		card testCard = testDeck.drawNextCard();
		String result = testCard.toString();
		assertEquals(result, "card [suite=CLUBS, rank=KING]");
	}

	@Test
	public void testDrawnKnownCardAtPosition() {
		card testCard = testDeck.drawCardAtPosition(10);
		String result = testCard.toString();
		assertEquals(result, "card [suite=SPADES, rank=JACK]");
	}

	@Test
	public void testDrawnKnownCardAtPosition2() {
		card testCard = testDeck.drawCardAtPosition(26);
		String result = testCard.toString();
		assertEquals(result, "card [suite=DIAMONDS, rank=ACE]");
	}

	@Test
	public void testDeckIsEmpty() {
		testDeck.drawAllRemainingCards();
		assertEquals(0, testDeck.getCardCount());
	}
}
