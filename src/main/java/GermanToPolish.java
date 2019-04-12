import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class GermanToPolish implements Dictionary {
    private static final String DATA_SEPARATOR = ";";
    private static Map<String, String> polishToEnglishMap = new HashMap<>();
    private static Map<String, String> englishToGermanMap = new HashMap<>();
    private static Map<String, String> germanToPolishMap = new HashMap<>();

    public Path generateGermanToPolishTranslationFile(String polish2EnglishDictionaryPath, String english2GermanDictionaryPath) throws IOException {
        Path path = Paths.get("src/main/resources/GER2POL.txt");
        PolishToEnglish polishToEnglish = new PolishToEnglish();
        polishToEnglishMap = polishToEnglish.polishToEnglish(polish2EnglishDictionaryPath);
        EnglishToGerman englishToGerman = new EnglishToGerman();
        englishToGermanMap = englishToGerman.englishToGerman(english2GermanDictionaryPath);


        for (Map.Entry<String, String> entry : polishToEnglishMap.entrySet()) {
            entry.getKey();
            String polishWord = entry.getKey();
            String englishWord = entry.getValue();
            String germanWord = englishToGermanMap.get(englishWord);
            if (germanWord != null && polishWord != null) {
                add(polishWord, germanWord);
            }
        }

        return (Files.write(path, () -> germanToPolishMap.entrySet().stream()
                .<CharSequence>map(e -> e.getKey() + DATA_SEPARATOR + e.getValue())
                .iterator()));
    }


    @Override
    public boolean add(String word, String translation) {
        if (germanToPolishMap.containsKey(word)) {
            return false;
        } else {
            germanToPolishMap.put(word, translation);
            return true;
        }
    }
}
