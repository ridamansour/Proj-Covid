import java.util.ArrayList;

public class methodsLib {
	
	public static String filter(String text) {
		boolean c= true;
		String final_S = "";
		char text_array[] = text.toCharArray();
		ArrayList<Character> filtered = new ArrayList<Character>();
		
		for(char charecter: text_array) {
			if (!contains(charecter)) {
				filtered.add(charecter);
			}
		}
		for (int i = 0; i < filtered.size(); i++) {
			final_S += filtered.get(i);
		}
		return final_S;
	}
	
	public static boolean contains(char charecter) {
		char ext[] = {'َ','ً','ِ','ٍ','ُ','ٌ','ْ','ّ',',','.','…','@',':'};
		for(char chare: ext) {
			if (chare ==charecter) {return true;}
		}
		return false;
	}
	
	/* An Integer type method that gets in the input a sentence (text) 
	 * & an array of words that represents the roots of a specific word 
	 * and it finds where the index of this word and returns the index of word in a string
	 */
	public static int index_of_word(String names[], String text) {
		String[] text_words = text.split(" ");
		for (int i = 0; i < text_words.length; i++) {
			for (int j = 0; j < names.length; j++) {
				if (names[j].length() < text_words[i].length()) {
					for (int j2 = 0; j2 < text_words[i].length()-names[j].length(); j2++) {
						if(text_words[i].substring(j2,j2+names[j].length()).equals(names[j])) {
							return i;
						}
					}
				} else if(text_words[i].equals(names[j])) {
					return i;
				}
			}
		}
		return 0;
	}
	
	/*
	 * A boolean type method that inputs a word (NOT A SENTENCE) 
	 * & an array of words that represents the roots of a specific word
	 * ... if the word is related or equals one of the words in the array it returns true
	 * and else it returns false
	 */
	public static boolean isInWord(String word, String names[]) {
		for (int j = 0; j < names.length; j++) {
			if (names[j].length() < word.length()) {
				for (int j2 = 0; j2 < word.length()-names[j].length(); j2++) {
					if(word.substring(j2,j2+names[j].length()).equals(names[j])) {
						return true;
					}
				}
			} else if(word.equals(names[j])) {
				return true;
			}
		}
		return false;
	}
	
	public static Object[] number_after_word(String text) {
		String textarr[] = text.split(" ");
		ArrayList <Object> arr= new ArrayList<Object>();
		int counti = 0;
		for (int i = 0; i < textarr.length; i++) {
			if (contains_numbers(textarr[i])) {
				
				arr.add(Integer.valueOf(filterAll(textarr[i])));
			} else if (isInWord(textarr[i], infections_words)) {
				arr.add(textarr[i]);
			} else if (isInWord(textarr[i], death_words)) {
				arr.add(textarr[i]);
			} else if (isInWord(textarr[i], recovery_words)) {
				arr.add(textarr[i]);
			}
			
		}
		return arr.toArray();
	}
	/*
	 * A boolean type method that inputs a word or sentence and returns true if
	 * the text contains a number and else it returns false
	 */
	public static boolean contains_numbers(String text) {
		char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < nums.length; j++) {
				if(text.charAt(i) == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	/*
	 * root words for the word "infect" in Arabic
	 */
	public static String[] infections_words = {
			"صاب",
			"صيب",
			"يصب",
			"منصبا"
	};
	
	/*
	 * root words for the word "die" in Arabic
	 */
	public static String[] death_words = {
			"لموت",
			"مئات",
			"مات",
			"المئات",
			"موت",
			"الميت",
			"يموت",
			"تموت",
			"الموت",
			"ميت",
			"للموت",
			"ومات",
			"بالموت",
			"ماتوا",
			"الأموات",
			"ميتة",
			"وفي",
			"بوفاة",
			"وف",
			"وفاة",
			"وفا",
			"الوفاء",
			"توفي",
			"وفاء",
			"وفاته",
			"وفى",
			"الوفاة",
			"الوفيات",
			"اوف",
			"توفيت",
			"الوفاء"
	};
	
	/*
	 * root words for the word "recover" in Arabic
	 */
	public static String[] recovery_words= {
			"عافي",
			"عوفي",
			"عافى",
			"عافا",
			"والعافين",
			"تتعافي",
			"بالتعافي",
			"والعافية",
			"عفا",
			"التعافي",
			"يتعافى",
			"يتعافى",
			"تعفي",
			"شفا"};
	
	private static String filterAll(String text) {
		boolean c= true;
		String final_S = "";
		char text_array[] = text.toCharArray();
		ArrayList<Character> filtered = new ArrayList<Character>();
		
		for(char charecter: text_array) {
			if (!containsAll(charecter)) {
				filtered.add(charecter);
			}
		}
		for (int i = 0; i < filtered.size(); i++) {
			final_S += filtered.get(i);
		}
		return final_S;
	}
	
	/*
	 * A boolean type method that gets in the input a character 
	 * if the character is Arabic character or an Arabic additive it returns true
	 * else it returns false
	 */
	private static boolean containsAll(char charecter) {
		char ext[] = {'َ','ً','ِ','ٍ','ُ','ٌ','ْ','ّ',',','.','…','ى', 'ئ', 'ء', 'أ', 'إ', 'ؤ', 'آ', 'ا', 'ل', 'ب', 'ي', 'س', 'ش', 'ك', 'م', 'ة', 'ج', 'ح', 'خ', 'ه', 'ع', 'غ', 'ف', 'ق', 'ث', 'ص', 'ض', 'و', 'ر', 'ز', 'د', 'ذ', 'ط', 'ظ'};
		for(char chare: ext) {
			if (chare ==charecter) {return true;}
		}
		return false;
	}
	
	public static void print(textAnalize a) {
		System.out.println("  [ "+a.getText()+" ]");
		System.out.println("  [ "+"Country:"+a.getCountry().getLand()+" ]");
		System.out.println("  [ CountryID: '"+ a.getCountry().getLandID()+"' ]");
		System.out.print("  [ ");
		a.print();
		System.out.print("]");
	}
	
}
