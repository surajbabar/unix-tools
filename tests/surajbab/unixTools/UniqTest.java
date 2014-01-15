package surajbab.unixTools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UniqTest {
    @Test
    public void testUniqLines() throws Exception {
        String data = "first\r\nfirst\r\nsecond";
        String expected = "first\r\nsecond\r\n";
        Uniq uniq = new Uniq();

        String actual = uniq.UniqLines(data);

        assertEquals(expected, actual);
    }
}
