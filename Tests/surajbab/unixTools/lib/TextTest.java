package surajbab.unixTools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TextTest extends Text {
    String content ="suraj babar\r\nsumit varude\r\naniket survase";

    @Test
    public void testLines() throws Exception {
     int expected =3;

     int actual =lines(content);

     assertEquals(expected,actual);
    }

    @Test
    public void testWords() throws Exception {
        int expected =6;

        int actual =words(content);

        assertEquals(expected,actual);
    }

    @Test
    public void testChars() throws Exception {
        int expected =41;
        int actual =chars(content);

        assertEquals(expected,actual);
    }
}
