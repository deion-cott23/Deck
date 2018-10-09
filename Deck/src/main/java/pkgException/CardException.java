package pkgException;

import pkgCore.Decks;

public class CardException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Decks d;
	
	public CardException(Decks d) {
		super();
		this.d = d;
	}
	
	protected Decks getD() {
		return d;
	}
	
}
