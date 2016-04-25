package ie.lyit.comp.cardgame;

public class card {
	

	private Suite suite;
	private Rank rank;
	
	
	public card(ie.lyit.comp.cardgame.Suite suite, ie.lyit.comp.cardgame.Rank rank) {
		super();
		this.suite = suite;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "card [suite=" + suite + ", rank=" + rank + "]";
	}

}
