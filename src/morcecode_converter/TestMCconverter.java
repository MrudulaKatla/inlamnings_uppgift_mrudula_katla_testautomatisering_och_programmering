package morcecode_converter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMCconverter {
    @Test
    public void TestEnglishWordToMorsecode() {
        Convert test = new Convert();

        String text = "Hello";
        String expected = "**** * *-** *-** ---";
        String actual = test.getMC(text);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestMorsecodeToEnglishWord() {
        Convert test = new Convert();
        String morsecode = "**** --- *--  *- *-* *  -*-- --- **-";
        String expected = "HOW ARE YOU";
        String actual = test.getEnglish(morsecode);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestEnglishSentenceToMorsecode() {
        Convert test = new Convert();

        String text = "Have a nice day";
        String expected = "**** *- ***- *  *-  -* ** -*-* *  -** *- -*--";
        String actual = test.getMC(text);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestSingleLetterwordstoMC() {
        Convert test = new Convert();
        String text = "o m g";
        String expected = "---  --  --*";
        String actual = test.getMC(text);
        Assertions.assertEquals(expected, actual);
    }



}
