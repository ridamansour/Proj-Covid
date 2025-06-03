# 🇧🇷 Arabic COVID-19 Country Analyzer
This Java project performs textual analysis on Arabic-language news articles or tweets to extract COVID-19 statistics and associate them with countries mentioned in the text.

---

## 📌 Features

- 🧠 **Arabic Text Analysis**  
  Detects root words of countries from Arabic text, even if embedded or modified linguistically.

- 📊 **COVID-19 Stats Extraction**  
  Parses numbers related to new cases, deaths, and recoveries from text using contextual keywords.

- 🌍 **Country Recognition**  
  Identifies country names (and their ISO codes) using root-word matching via a predefined country list.

---

## 🧪 Example

```java
textAnalize object = new textAnalize("أعلنت وزارة الصحة البرازيلية، مساء السبت، عن تسجيلها 38307 إصابات و921 وفاة جديدة بفيروس كورونا...");
print(object);
````

**Output:**

```
Country: برازيل (BR)
New Cases: 38307
New Deaths: 921
New Recoveries: 0
```

---

## 🗂️ Project Structure

```
src/
├── Main.java                // Entry point of the application
├── Country.java             // Country object + logic to detect country from text
├── Covid.java               // COVID-19 data extraction class
├── methodsLib.java          // Utility methods for text processing
```

---

## 📚 Core Classes

### `Country.java`

Represents a country with:

* Arabic name
* Root for pattern matching
* ISO 3166 country code

Includes:

* `conAnalyzer(String text)` to detect the country from a given text.

---

### `Covid.java`

Analyzes input text for:

* Infection counts
* Death counts
* Recovery counts

Uses keyword-based heuristics to locate relevant information.

---

### `methodsLib.java`

Provides:

* Diacritic and punctuation filtering (`filter`)
* Character/word matching tools
* Position-based matching for infection, death, and recovery keywords

---

## 🌐 Language & Compatibility

* 📝 Language: Java 8+
* 🌍 Language Support: Arabic
* 🧪 Suitable for:

  * Console-based applications
  * Textual social media feeds (e.g., tweets, headlines)

---

## 🚀 How to Run

1. Clone the repository.

2. Compile the Java classes:

   ```bash
   javac Main.java
   ```

3. Run the application:

   ```bash
   java Main
   ```

---

## 🔮 Future Improvements

* 🌐 Add English or multilingual support
* 📈 Extract historical statistics
* 🧪 Implement NLP techniques for improved accuracy
* 🔗 Integrate with online APIs for real-time analysis

---

## 📄 License

This project is for educational and research purposes only.
