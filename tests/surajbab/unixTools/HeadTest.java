package surajbab.unixTools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadTest {
    @Test
    public void testHeadContent() throws Exception {
        String data = "1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10";
        String expected = "1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10";
        Head head = new Head();

        String actual = head.headContent(data,10);

        assertEquals(expected,actual);
    }

    @Test
    public void testHeadwithLesserCount() throws Exception {
        String data = "first\r\nSecond\r\nThird";
        String expected = "first\r\nSecond";
        Head head = new Head();

        String actual = head.headContent(data,2);

        assertEquals(expected,actual);
    }

    @Test
    public void testHeadwithEmptyData() throws Exception {
        String data = "";
        String expected = "";
        Head head = new Head();

        String actual = head.headContent(data,10);

        assertEquals(expected,actual);
    }
}
