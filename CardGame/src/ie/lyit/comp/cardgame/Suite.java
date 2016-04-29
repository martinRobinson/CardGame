package ie.lyit.comp.cardgame;

public enum Suite {
	SPADES (4), 
	HEARTS (3), 
	DIAMONDS (2), 
	CLUBS (1);
	 
	private int suiteValue;

    private Suite(int suiteValue) {
            this.suiteValue = suiteValue;
    }
    
    public int getSuiteValue() {
    	return suiteValue;
    }
}
