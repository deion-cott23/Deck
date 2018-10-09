package pkgTester;


import static org.junit.Assert.*;


import org.junit.Test;

import pkgCore.Decks;
import pkgEnum.eRank;
import pkgEnum.eSuit;

public class tester {

	@Test
	public void CardsRemain_test() {
		//Creates a new deck and draws 3 cards
		Decks d = new Decks();
		d.Draw(eSuit.DIAMONDS);
		d.Draw(eSuit.SPADES);
		d.Draw(eSuit.CLUBS);
		
		assertTrue(d.getCardsRemain(eSuit.SPADES) == 14);
		assertTrue(d.getCardsRemain(eSuit.CLUBS) == 2);
		assertTrue(d.getCardsRemain(eSuit.DIAMONDS) == 10);
		
		//New deck and draws 3 cards
		Decks d1 = new Decks();
		d1.Draw(eRank.EIGHT);
		d1.Draw(eRank.FIVE);
		d1.Draw(eRank.TWO);
		
		assertTrue(d1.getCardsRemain(eRank.EIGHT) == 3);
		assertTrue(d1.getCardsRemain(eRank.FIVE) == 1);
		assertTrue(d1.getCardsRemain(eRank.TEN) == 6);
		
		
	}

}
