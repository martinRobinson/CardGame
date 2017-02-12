package ie.lyit.comp.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deck {
	int cardsInDeck = 0;

	private List<card> deck = new ArrayList<>();

	public deck() {
		for (Suite suite : Suite.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new card(suite, rank));
				cardsInDeck++;
			}
		}

	}

	public void printAllCards() {
		for (card card : deck) {
			System.out.println(card.toString() + " " + card.getRank());
		}
	}

	public void drawAllRemainingCards() {
		for (card card : deck) {
			card drawnCard = card;
			drawnCard.toString();
			cardsInDeck--;
		}
	}

	@Override
	public String toString() {

		return "deck [deck=" + deck + "]";
	}

	public card drawNextCard() {
		card drawnCard = deck.get(cardsInDeck - 1);
		cardsInDeck--;
		return drawnCard;
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public int getCardCount() {
		return cardsInDeck;
	}

	public card drawCardAtPosition(int position) {
		card drawnCard = deck.get(position);
		cardsInDeck--;
		return drawnCard;
	}

	public Boolean isEmpty() {
		if (cardsInDeck == 0)
			return true;
		else
			return false;
	}
}
