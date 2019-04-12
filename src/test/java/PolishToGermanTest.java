import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class PolishToGermanTest {

    @Test
    public void ExistingWordInBothDictionaries() throws IOException {
        PolishToGerman polishToGerman = new PolishToGerman();
        assertEquals("grun", polishToGerman.polishToGerman("src/main/resources/POL2ENG.txt", "src/main/resources/ENG2GER.txt", "zielony"));
    }

    @Test
    public void UnExistingWordInOneDictionaries() throws IOException {
        PolishToGerman polishToGerman = new PolishToGerman();
        assertEquals("No translation", polishToGerman.polishToGerman("src/main/resources/POL2ENG.txt", "src/main/resources/ENG2GER.txt", "zegarek"));
    }

    @Test
    public void UnExistingWordInBothDictionaries() throws IOException {
        PolishToGerman polishToGerman = new PolishToGerman();
        assertEquals("No translation", polishToGerman.polishToGerman("src/main/resources/POL2ENG.txt", "src/main/resources/ENG2GER.txt", "XD"));
    }
}
