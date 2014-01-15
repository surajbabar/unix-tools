package surajbab.unixTools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TailTest {
    @Test
    public void testTailContent() throws Exception {
        String data = "1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10";
        String expected = "1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\n";
        Tail tail = new Tail();

        String actual = tail.TailContent(data, 10);

        assertEquals(expected, actual);
    }

    @Test
    public void testTailwithLesserCount() throws Exception {
        String data = "first\r\nSecond\r\nThird";
        String expected = "Second\r\nThird\r\n";
        Tail tail = new Tail();

        String actual = tail.TailContent(data, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testTailwithEmptyData() throws Exception {
        String data = "";
        String expected = "\r\n";
        Tail tail = new Tail();

        String actual = tail.TailContent(data, 10);

        assertEquals(expected, actual);

    }
}
