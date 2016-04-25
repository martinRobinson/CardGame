package ie.lyit.comp.cardgame;

public class card {
	

	private Suite suite;
	private Rank rank;
	
	public card(){
		
	}
	public card(ie.lyit.comp.cardgame.Suite suite, ie.lyit.comp.cardgame.Rank rank) {
		super();
		this.suite = suite;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "card [suite=" + suite + ", rank=" + rank + "]";
	}
	
	@Override
	public int hashCode() {
		return (suite.ordinal() * 13) + rank.ordinal();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		card other = (card) obj;
		if (rank != other.rank)
			return false;
		if (suite != other.suite)
			return false;
		return true;
	}

}
