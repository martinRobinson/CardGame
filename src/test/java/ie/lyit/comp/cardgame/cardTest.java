package ie.lyit.comp.cardgame;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ie.lyit.comp.cardgame.elements.card;

public class cardTest extends card {
	
	private card AceOfSpadesTestCard1;
	private card AceOfHeartsTestCard;
	private card AceOfSpadesTestCard2;
	private card FiveOfDiamondsTestCard4;
	
	@Before
	public void setUp(){
		AceOfSpadesTestCard1 = new card(Suite.SPADES, Rank.ACE);
		AceOfHeartsTestCard = new card(Suite.HEARTS, Rank.ACE);
		AceOfSpadesTestCard2 = new card(Suite.SPADES, Rank.ACE);
		FiveOfDiamondsTestCard4 = new card(Suite.DIAMONDS, Rank.FIVE);
	}

	@Test
	public void testToString() {
		String result = AceOfSpadesTestCard1.toString();
		assertEquals(result, "card [suite=SPADES, rank=ACE]");
	}
	
	@Test
	public void testHashCode() {
		int testCardHashCode = AceOfSpadesTestCard1.hashCode();
		System.out.println(testCardHashCode);
		assertEquals(0, testCardHashCode);
	}
	
	@Test
	public void testHashCode2() {
		int testCardHashCode = AceOfHeartsTestCard.hashCode();
		System.out.println(testCardHashCode);
		assertEquals(13, testCardHashCode);
	}
	
	@Test
	public void testAbsoluteCardEquality() {
		assert(AceOfSpadesTestCard1.equals(AceOfSpadesTestCard2));	
	}
	

	@Test
	public void testMatchingCardRank() {
		assertEquals(AceOfHeartsTestCard.getRank().getRankValue(), AceOfSpadesTestCard2.getRank().getRankValue());
	}
	
	@Test
	public void testCardNonMatchingCardSuite() {
		assertNotEquals(AceOfHeartsTestCard.getSuite().getSuiteValue(), AceOfSpadesTestCard2.getSuite().getSuiteValue());
	}
	
	@Test
	public void testCardCompareToCardEqualRank() {
		int result = AceOfHeartsTestCard.compareTo(AceOfSpadesTestCard1);
		assertTrue("Expect cards to be equal by rank", result==0);
	}
	
	@Test 
	public void testCardCompareToCardOfGreaterRank() {
		int result = AceOfHeartsTestCard.compareTo(FiveOfDiamondsTestCard4);
		assertTrue("Expect second card to be of greater rank", result==-1);		
	}
	
	@Test 
	public void testCardCompareToCardOfLesserRank() {
		int result = FiveOfDiamondsTestCard4.compareTo(AceOfHeartsTestCard);
		assertTrue("Expect second card to be of greater rank", result==1);		
	}
	
	@Test
	public void testTest() {
		String cardString = AceOfHeartsTestCard.toString();
		assertThat(cardString, containsString("HEARTS"));
	}
}
