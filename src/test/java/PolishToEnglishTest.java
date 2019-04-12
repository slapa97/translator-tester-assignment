import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PolishToEnglishTest {

    @Test
    public void ExistingWord_Polish2EnglishTest() throws IOException {
        PolishToEnglish polishToEnglish = new PolishToEnglish();
        assertEquals("bike", polishToEnglish.Polish2English("src/main/resources/POL2ENG.txt", "rower"));
    }

    @Test
    public void TwoWordWord_Polish2EnglishTest() throws IOException {
        PolishToEnglish polishToEnglish = new PolishToEnglish();
        assertEquals("rainforest", polishToEnglish.Polish2English("src/main/resources/POL2ENG.txt", "las deszczowy"));
    }

    @Test
    public void NonExistingWord_Polish2EnglishTest() throws IOException {
        PolishToEnglish polishToEnglish = new PolishToEnglish();
        assertEquals("No translation", polishToEnglish.Polish2English("src/main/resources/POL2ENG.txt", "XD"));
    }

    @Test
    public void EmptyString_Polish2EnglishTest() throws IOException {
        PolishToEnglish polishToEnglish = new PolishToEnglish();
        assertEquals("No translation", polishToEnglish.Polish2English("src/main/resources/POL2ENG.txt", ""));
    }
}