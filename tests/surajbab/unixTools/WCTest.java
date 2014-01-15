package surajbab.unixTools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WCTest {
    @Test
    public void testLineCount() throws Exception {
        String data = "first\r\nsecond\r\nThird";
        WC wc = new WC(data);
        int expected = 3;

        int actual = wc.lineCount();

        assertEquals(expected,actual);
    }

    @Test
    public void testCharCount() throws Exception {
        String data = "first\r\nsecond\r\nThird";
        WC wc = new WC(data);
        int expected = 3;

        int actual = wc.charCount();

        assertEquals(expected,actual);
    }

    @Test
    public void testWordCount() throws Exception {
        String data = "first\r\nsecond\r\nThird";
        WC wc = new WC(data);
        int expected = 3;

        int actual = wc.wordCount();

        assertEquals(expected,actual);
    }
}
