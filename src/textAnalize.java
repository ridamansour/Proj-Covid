public class textAnalize extends methodsLib {
	
	private String text;
	private Country country;
	private Covid cases;
	private static Object[] arr;
	private static Country con;
	
	public textAnalize(String text) {
		this.cases = new Covid(text);
		setText(text);
		this.country = Country.conAnalyzer(text);
		arr = number_after_word(this.text);
		con = this.country;
	}
	
	public String getText() {
		return filter(text);
	}

	public void setText(String text) {
		this.text = filter(text);
	}
	public Country getCountry() {
		return country;
	}
	
	public Covid getCases() {
		return cases;
	}

	@Override
	public String toString() {
		return "textAnalize [ "+" country=" + country.getLand() + ", cases=" + cases + "]";
	}
	
	public static void print() {
		String a = "";
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
	}
}
