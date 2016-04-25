package ie.lyit.comp.cardgame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class cardTest extends card {
	
	private card testCard;
	private card testCard2;
	
	@Before
	public void setUp(){
		testCard = new card(Suite.SPADES, Rank.ACE);
		testCard2 = new card(Suite.HEART, Rank.ACE);
	}

	@Test
	public void testToString() {
		String result = testCard.toString();
		assertEquals(result, "card [suite=SPADES, rank=ACE]");
	}
	
	@Test
	public void testHashCode() {
		int testCardHashCode = testCard.hashCode();
		System.out.println(testCardHashCode);
		assertEquals(0, testCardHashCode);
	}
	
	@Test
	public void testHashCode2() {
		int testCardHashCode = testCard2.hashCode();
		System.out.println(testCardHashCode);
		assertEquals(13, testCardHashCode);
	}
}
