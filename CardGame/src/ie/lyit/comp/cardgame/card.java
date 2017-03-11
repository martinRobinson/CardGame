package ie.lyit.comp.cardgame;

public class card implements Comparable<card> {

	private Suite suite;
	private Rank rank;

	public card() {

	}

	public card(Suite suite, Rank rank) {
		super();
		this.suite = suite;
		this.rank = rank;
	}

	public Suite getSuite() {
		return suite;
	}

	@Override
	public int compareTo(card that) {
		if (this.getRank().getRankValue() == that.getRank().getRankValue()) {
			return 0;
		} else if (this.getRank().getRankValue() < that.getRank().getRankValue()) {
			return -1;
		} else if (this.getRank().getRankValue() > that.getRank().getRankValue()) {
			return 1;
		}
		return 0;

	}

	public Rank getRank() {
		return rank;
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
