import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class EnglishToGermanTest {

    @Test
    public void WordFromFile_tranlsateTest() throws IOException {
        EnglishToGerman englishToGerman = new EnglishToGerman();
        assertEquals("apfel", englishToGerman.english2German("src/main/resources/ENG2GER.txt", "apple"));
    }

    @Test
    public void NonExistingWord_English2GermanTest() throws IOException {
        PolishToEnglish polishToEnglish = new PolishToEnglish();
        assertEquals("No translation", polishToEnglish.Polish2English("src/main/resources/ENG2GER.txt", "XD"));
    }

    @Test
    public void EmptyString_English2GermanTest() throws IOException {
        PolishToEnglish polishToEnglish = new PolishToEnglish();
        assertEquals("No translation", polishToEnglish.Polish2English("src/main/resources/ENG2GER.txt", ""));
    }
}