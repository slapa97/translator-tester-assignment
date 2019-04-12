import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolishToEnglish implements Dictionary {
    private static Map<String, String> polishToEnglish = new HashMap<>();
    private String path;


    public String Polish2English(String polish2EnglishDictionaryPath, String polishExpression) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(polish2EnglishDictionaryPath));
        for (String line : strings) {
            String[] word = line.split(";");
            String polish = word[0];
            String english = word[1];
            add(polish, english);
        }
        return polishToEnglish.getOrDefault(polishExpression, "No translation");
    }

    public Map<String, String> polishToEnglish(String polish2EnglishDictionaryPath) throws IOException {
        this.path = polish2EnglishDictionaryPath;
        List<String> strings = Files.readAllLines(Paths.get(path));
        for (String line : strings) {
            String[] word = line.split(";");
            String polish = word[0];
            String english = word[1];
            add(polish, english);
        }
        return polishToEnglish;
    }


    @Override
    public boolean add(String word, String translation) {
        if (polishToEnglish.containsKey(word)) {
            return true;
        } else {
            polishToEnglish.put(word, translation);
            return false;
        }
    }
}
