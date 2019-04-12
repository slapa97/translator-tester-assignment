import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GermanToPolishTest {
    @Test
    public void PathCorrectness_generateGermanToPolishTranslationFileTest() throws IOException {
        GermanToPolish germanToPolish = new GermanToPolish();
        assertEquals(Paths.get("src/main/resources/GER2POL.txt"), germanToPolish.generateGermanToPolishTranslationFile("src/main/resources/POL2ENG.txt", "src/main/resources/ENG2GER.txt"));
    }

    @Test
    public void PathInCorrectness_generateGermanToPolishTranslationFileTest() throws IOException {
        GermanToPolish germanToPolish = new GermanToPolish();
        assertNotEquals(Paths.get("src/main/resou"), germanToPolish.generateGermanToPolishTranslationFile("src/main/resources/POL2ENG.txt", "src/main/resources/ENG2GER.txt"));
    }
}