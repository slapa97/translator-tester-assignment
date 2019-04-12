import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnglishToGerman implements Dictionary {
    private static Map<String, String> englishToGerman = new HashMap<>();
    private String path;

    public String english2German(String path, String englishExpression) throws IOException {
        this.path = path;

        List<String> strings = Files.readAllLines(Paths.get(path));
        for (String line : strings) {
            String[] word = line.split(";");
            String english = word[0];
            String german = word[1];
            add(english, german);
        }
        return englishToGerman.getOrDefault(englishExpression, "No translation");
    }


    @Override
    public boolean add(String word, String translation) {
        if (englishToGerman.containsKey(word)) {
            return false;
        } else {
            englishToGerman.put(word, translation);
            return true;
        }
    }

    public Map<String, String> englishToGerman(String english2GermanDictionaryPath) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(english2GermanDictionaryPath));
        for (String line : strings) {
            String[] word = line.split(";");
            String english = word[0];
            String german = word[1];
            add(english, german);
        }
        return englishToGerman;
    }

}