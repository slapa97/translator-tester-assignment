import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PolishToGerman implements Dictionary {
    private static Map<String, String> polishToGermanMap = new HashMap<>();
    private static Map<String, String> polishToEnglishMap = new HashMap<>();
    private static Map<String, String> englishToGermanMap = new HashMap<>();


    public String polishToGerman(String polish2EnglishDictionaryPath, String english2GermanDictionaryPath, String polishExpression) throws IOException {

        String germanTranslation;
        PolishToEnglish polishToEnglish = new PolishToEnglish();
        polishToEnglishMap = polishToEnglish.polishToEnglish(polish2EnglishDictionaryPath);

        EnglishToGerman englishToGerman = new EnglishToGerman();
        englishToGermanMap = englishToGerman.englishToGerman(english2GermanDictionaryPath);

        germanTranslation = englishToGermanMap.getOrDefault(polishToEnglishMap.get(polishExpression), "No translation");
        return germanTranslation;
    }

    @Override
    public boolean add(String word, String translation) {
        if (polishToGermanMap.containsKey(word)) {
            return false;
        } else {
            polishToGermanMap.put(word, translation);
            return true;
        }
    }

}
