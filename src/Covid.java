

public class Covid extends methodsLib{
	private static String text;
	private int newCases;
	private int newDeath;
	private int newRecovery;
	
	//covid constructor
	public Covid(int newCases, int newDeath, int newRecovery) {
		super();
		this.newCases = newCases;
		this.newDeath = newDeath;
		this.newRecovery = newRecovery;
		index_of_infections = index_of_word(infections_words, text);
		index_of_death = index_of_word(death_words, text);
		index_of_recovery = index_of_word(recovery_words, text);
	}
		
	//covid constructor with text analysis
	public Covid(String textr) {
		setText(textr);
		setNewRecovery(0);
		
		index_of_infections = index_of_word(infections_words, text);
		index_of_death = index_of_word(death_words, text);
		index_of_recovery = index_of_word(recovery_words, text);
	}
	
	public int getNewRecovery() {
		return newRecovery;
	}
	
	public void setNewRecovery(int newRecovery) {
		this.newRecovery = newRecovery;
	}
	
	public int getNewDeath() {
		return newDeath;
	}
	
	public void setNewDeath(int newDeath) {
		this.newDeath = newDeath;
	}
	
	public int getNewCases() {
		return newCases;
	}
	
	public void setNewCases(int newCases) {
		this.newCases = newCases;
	}
	
	public void setText(String textr) {
		text = textr;
	}
	public static int index_of_infections; // the index of the word that represents "infections"
	public static int index_of_death; // the index of the word that represents "death"
	public static int index_of_recovery; // the index of the word that represents "recovery"
	
	/*
	 * a structure that inputs an object array that contains final info 
	 * (every number in the text, every infection word, every death word, recovery word)
	 * and it sets 
	 */
	
	
}
