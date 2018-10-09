package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.CardException;

public class Decks {
	private ArrayList<Cards> deckOfCards = new ArrayList<Cards>();
	
	public Decks() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values() ) {
				deckOfCards.add(new Cards(eSuit, eRank));
			}
		}
		Collections.shuffle(deckOfCards);
	}
	
	public Cards Draw() throws CardException {
		if (deckOfCards.size() == 0) {
			throw new CardException(this);
		}
		return deckOfCards.remove(0);
	}
	
	public Cards Draw(eSuit eSuit) {
		for (Cards c : deckOfCards) {
			if (c.geteSuit() == eSuit) {
				deckOfCards.remove(c);
				return (c);
			}
		}
		
		return (null);
	}
	
	public Cards Draw(eRank eRank) {
		for (Cards c : deckOfCards) {
			if (c.geteRank() == eRank) {
				deckOfCards.remove(c);
				return (c);
				
			}
		}
		return (null);
	}
	
	public int getiCount() {
		return deckOfCards.size();
		
	}
	
	public int getCardsRemain(eRank eRank) {
		int count = 0;
		for (Cards c : deckOfCards) {
			if (c.geteRank() == eRank) {
				count++;
			}
		}
		return count;
	}
	
	public int getCardsRemain(eSuit eSuit) {
		int count = 0;
		for (Cards c : deckOfCards) {
			if (c.geteSuit() == eSuit) {
				count++;
			}
		}
		return count;
	}

}
