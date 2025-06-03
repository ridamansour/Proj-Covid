import java.util.ArrayList;
import java.util.Arrays;

public class test {
	public static Country[] countries_list = Country.countries_list;
	
	public static int index_of_infections(String text) {
		String[] text_words = text.split(" ");
		for (int i = 0; i < text_words.length; i++) {
			for (int j = 0; j < infections_words.length; j++) {
				if (infections_words[j].length() < text_words[i].length()) {
					for (int j2 = 0; j2 < text_words[i].length()-infections_words[j].length(); j2++) {
						if(text_words[i].substring(j2,j2+infections_words[j].length()).equals(infections_words[j])) {
							return i;
						}
					}
				} else if(text_words[i].equals(infections_words[j])) {
					return i;
				}
			}
		}
		return 0;
	}
	
	public static String[] infections_words = {
			"صاب",
			"صيب"
	};
	
	public static String filter(String text) {
		boolean c= true;
		String final_S = "";
		char text_array[] = text.toCharArray();
		ArrayList<Character> filtered = new ArrayList<Character>();
		char ext[] = {'َ','ً','ِ','ٍ','ُ','ٌ','ْ','ّ',','};
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
		char ext[] = {'َ','ً','ِ','ٍ','ُ','ٌ','ْ','ّ'};
		for(char chare: ext) {
			if (chare ==charecter) {return true;}
		}
		return false;
	}
	
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
	public static void main(String[] args) {
		String text = "RT @SyriawatanNews: وزارة الصحة: تسجيل 61 إصابة جديدة بفيروس كورونا مايرفع عدد الإصابات المسجلة في سورية إلى 6613 شفاء 56 حالة من الإصابات…ِ";
		text = filter(text);
		
		String[] textarr = text.split(" ");
		for (int j = 0; j < countries_list.length; j++) {
			for (int i = 0; i < textarr.length; i++) {
				if(textarr[i].equals(countries_list[j].getLand())) {
					System.out.println(countries_list[j].getLand());
				}
			}
		}
		String word  = "منت بتت بتتب تبتبت تبتبتبتتبتب عفا 1234 ";
		String wordlis[] = word.split(" ");
		String words[] = new String[5];
		int count = 0;
		for (int i = 0; i < wordlis.length; i++) {
			for (int j = 0; j < names.length; j++) {
				if (names[j].length() < wordlis[i].length()) {
					for (int j2 = 0; j2 < wordlis[i].length()-names[j].length(); j2++) {
						if(word.substring(j2,j2+names[j].length()).equals(names[j])) {
							words[count++] = wordlis[i];
						}
					}
				} else if(word.equals(names[j])) {
					words[count++] = wordlis[i];
				}
			}
		
		}
		System.out.println(Arrays.toString(words));
		
		
	}
	public static String[] names= {
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
}
