package pkgCore;

import pkgEnum.*;

public class Cards implements Comparable {
	
	private eSuit eSuit;
	private eRank eRank;
	
	public Cards(eSuit eSuit, eRank eRank) {
		super();
		this.eSuit = eSuit;
		this.eRank = eRank;
	}
	
	public eRank geteRank() {
		return eRank;
		
	}
	
	public eSuit geteSuit() {
		return eSuit;
		
	}
	
	public int compareTo(Object a) {
		Cards c = (Cards) a;
		return c.geteRank().compareTo(this.geteRank());
	}

}
