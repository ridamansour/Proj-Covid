
public class Country {
	private String root;
	private String land;
	private String landID;
	
	//Country constructor
	public Country(String root, String land, String landID) {
		setRoot(root);
		setLand(land);
		setLandID(landID);
	}
	public Country(String land, String landID) {
		setLand(land);
		setLandID(landID);
		setRoot("");
	}

	public String getLand() {
		return land;
	}
	
	public void setLand(String land) {
		this.land = land;
	}
	
	public String getLandID() {
		return landID;
	}
	
	public void setLandID(String landID) {
		this.landID = landID;
	}
	
	/*
	 * A Country object return type that inputs text and whenever it finds a country name 
	 * it returns the country object of the country containing the country name and country ID
	 */
	public static Country conAnalyzer(String x){
		String[] text_words = x.split(" ");
		for (int j = 0; j < countries_list.length; j++) {
			for (int i = 0; i < text_words.length; i++) {
				
				if (countries_list[j].land.length() < text_words[i].length()) {
					for (int j2 = 0; j2 < text_words[i].length()-countries_list[j].land.length(); j2++) {
						if(text_words[i].substring(j2,j2+countries_list[j].root.length()).equals(countries_list[j].getRoot())) {
							return countries_list[j];
						}
					}
				} else if(text_words[i].equals(countries_list[j].root)) {
					return countries_list[j];
				}
			}
		}
		return new Country("","");
	}
	
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
 
	/*
	 * an array that contains every country name and ID in Country Object form
	 */
	public static Country countries_list[] = {
            new Country("فغانس", "افغانستان", "AF"),
            new Country("جزر ", "جزر الأرض", "AX"),
            new Country("بانيا", "البانيا", "AL"),
            new Country("جزائر ", "الجزائر", "DZ"),
            new Country("ندور", "اندورا", "AD"),
            new Country("نغول", "انغولا", "AO"),
            new Country("نغيل", "انغيلا", "AI"),
            new Country("تاركتيك", "نتاركتيكا", "AQ"),
            new Country("بربود", "أنتيغوا وبربودا", "AG"),
            new Country("رجنتين", "الأرجنتين", "AR"),
            new Country("رميني", "أرمينيا", "AM"),
            new Country("روبا", "أروبا", "AW"),
            new Country("سترالي", "أستراليا", "AU"),
            new Country("نمس", "النمسا", "AT"),
            new Country("ذربيج", "أذربيجان", "AZ"),
            new Country("جزر بهام", "جزر البهاما", "BS"),
            new Country("بحرين", "البحرين", "BH"),
            new Country("غلاديش", "بنغلاديش", "BD"),
            new Country("ربادوس", "بربادوس", "BB"),
            new Country("اروسي", "بيلاروسيا", "BY"),
            new Country("جيكا", "بلجيكا", "BE"),
            new Country("ليز", "بليز", "BZ"),
            new Country("بنن ", "بنن", "BJ"),
            new Country("رمود", "برمودا", "BM"),
            new Country("وتان", "بوتان", "BT"),
            new Country("ليفيا", "بوليفيا", "BO"),
            new Country("البوسنة والهرسك ", "البوسنة والهرسك", "BA"),
            new Country("تسوان", "بوتسوانا", "BW"),
            new Country("جزيرة بوفي", "جزيرة بوفيت", "BV"),
            new Country("رازي", "برازيل", "BR"),
            new Country("إقليم المحيط البريطاني الهندي ", "إقليم المحيط البريطاني الهندي", "IO"),
            new Country("بروناي دار السلام ", "بروناي دار السلام", "BN"),
            new Country("غاري", "بلغاريا", "BG"),
            new Country("بوركينا فاس", "بوركينا فاسو", "BF"),
            new Country("روند", "بوروندي", "BI"),
            new Country("مبوديا", "كمبوديا", "KH"),
            new Country("كاميرو", "الكاميرون", "CM"),
            new Country("كند", "كندا", "CA"),
            new Country("الرأس الأخضر ", "الرأس الأخضر", "CV"),
            new Country("جزر كايم", "جزر كايمان", "KY"),
            new Country("جمهورية افريقي", "جمهورية افريقيا الوسطى", "CF"),
            new Country("شاد", "تشاد", "TD"),
            new Country("شيل", "شيلي", "CL"),
            new Country("صين", "الصين", "CN"),
            new Country("كريسماس", "جزيرة الكريسماس", "CX"),
            new Country("جزر كوكوس كيلينغ ", "جزر كوكوس كيلينغ", "CC"),
            new Country("لومبي", "كولومبيا", "CO"),
            new Country("جزر القم", "جزر القمر", "KM"),
            new Country("كونغ", "الكونغو", "CG"),
            new Country("جمهورية الكونغو الديمقراطية ", "جمهورية الكونغو الديمقراطية", "CD"),
            new Country("جزر كوك ", "جزر كوك", "CK"),
            new Country("كوستا ريكا ", "كوستا ريكا", "CR"),
            new Country("رواتي", "كرواتيا", "HR"),
            new Country("كوب", "كوبا", "CU"),
            new Country("قبرص ", "قبرص", "CY"),
            new Country("تشيكي", "الجمهورية التشيكية", "CZ"),
            new Country("دنمارك", "الدنمارك", "DK"),
            new Country("جيبوتي ", "جيبوتي", "DJ"),
            new Country("ينيك", "دومينيكا", "DM"),
            new Country("دومنيك", "جمهورية الدومنيكان", "DO"),
            new Country("كوادو", "إكوادور", "EC"),
            new Country("مصر ", "مصر", "EG"),
            new Country("سلفادو", "السلفادور", "SV"),
            new Country("غينيا الإستوائ", "غينيا الإستوائية", "GQ"),
            new Country("ريتري", "إريتريا", "ER"),
            new Country("ستوني", "إستونيا", "EE"),
            new Country("ثيوبي", "أثيوبيا", "ET"),
            new Country("الفيناس", "جزر فوكلاند مالفيناس", "FK"),
            new Country("جزر فاروس ", "جزر فاروس", "FO"),
            new Country("يجي", "فيجي", "FJ"),
            new Country("فنلند", "فنلندا", "FI"),
            new Country("فرنس", "فرنسا", "FR"),
            new Country("غيانا الفرنسية ", "غيانا الفرنسية", "GF"),
            new Country("بولينيزيا الفرنسية ", "بولينيزيا الفرنسية", "PF"),
            new Country("المناطق الجنوبية لفرنسا ", "المناطق الجنوبية لفرنسا", "TF"),
            new Country("غابون ", "غابون", "GA"),
            new Country("غامبي", "غامبيا", "GM"),
            new Country("جورج", "جورجيا", "GE"),
            new Country("جورج", "جورجيا", "GE"),
            new Country("الماني", "ألمانيا", "DE"),
            new Country("غان", "غانا", "GH"),
            new Country("جبل طار", "جبل طارق", "GI"),
            new Country("اليون", "اليونان", "GR"),
            new Country("الأرض الخضراء ", "الأرض الخضراء", "GL"),
            new Country("غريناد", "غرينادا", "GD"),
            new Country("جوادلوب ", "جوادلوب", "GP"),
            new Country("غوام ", "غوام", "GU"),
            new Country("غواتيم", "غواتيمالا", "GT"),
            new Country("غيرنس", "غيرنسي", "GG"),
            new Country("غيني", "غينيا", "GN"),
            new Country("بيس", "غينيا - بيساو", "GW"),
            new Country("غيان", "غيانا", "GY"),
            new Country("", "هايتي", "HT"),
            new Country("كدونالز", "قلب الجزيرة وجزر ماكدونالز", "HM"),
            new Country("دولة الفاتيكان الكرسي الرسولي ", "دولة الفاتيكان الكرسي الرسولي", "VA"),
            new Country("هندورا", "هندوراس", "HN"),
            new Country("هونغ كونغ", "هونغ كونغ", "HK"),
            new Country("هنغار", "هنغاريا", "HU"),
            new Country("يسلند", "أيسلندا", "IS"),
            new Country("هند", "الهند", "IN"),
            new Country("ندونيسي", "إندونيسيا", "ID"),
            new Country("جمهورية إيران الإسلامية ", "جمهورية إيران الإسلامية", "IR"),
            new Country("عراق", "العراق", "IQ"),
            new Country("يرلند", "أيرلندا", "IE"),
            new Country("جزيرة آيل أوف مان ", "جزيرة آيل أوف مان", "IM"),
            new Country("سرائيل", "إسرائيل", "IL"),
            new Country("طالي", "إيطاليا", "IT"),
            new Country("جاماي", "جامايكا", "JM"),
            new Country("يابان", "اليابان", "JP"),
            new Country("جيرسي ", "جيرسي", "JE"),
            new Country("اردن", "الأردن", "JO"),
            new Country("كازاخست", "كازاخستان", "KZ"),
            new Country("كيني", "كينيا", "KE"),
            new Country("كيريبات", "كيريباتي", "KI"),
            new Country("كوريا الديمقراطية الشعبية ", "كوريا الديمقراطية الشعبية", "KP"),
            new Country("جمهورية كوري", "جمهورية كوريا", "KR"),
            new Country("كويت", "الكويت", "KW"),
            new Country("قيرغيزست", "قيرغيزستان", "KG"),
            new Country("شعب لاو ", "شعب لاو", "LA"),
            new Country("اتفي", "لاتفيا", "LV"),
		};
	
}
