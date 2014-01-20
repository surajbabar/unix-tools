package surajbab.unixTools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutTest {
    @Test
    public void testCutGetFieldsByFirstColumnAndSpaceDelimiter() throws Exception {
        String data = "s u r\r\na j a\r\nn d m a h e s h";
        String expected = "s\r\na\r\nn\r\n";
        Cut cut = new Cut();

        String actual = cut.getFields(data, 1, " ");

        assertEquals(expected, actual);
    }

    @Test
    public void testCutBySecondFieldAndSpaceDelimiter() throws Exception {
        String data = "s u r\r\na j a\r\nn d m a h e s h";
        String expected = "u\r\nj\r\nd\r\n";
        Cut cut = new Cut();

        String actual = cut.getFields(data, 2, " ");

        assertEquals(expected, actual);

    }

    @Test
    public void testGetFieldsWithInvalidFieldAndSpaceDelimiter() throws Exception {
        String data = "s u r\r\na j a\r\nn d ";
        String expected = "\r\n\r\n\r\n";
        Cut cut = new Cut();

        String actual = cut.getFields(data, 4, " ");

        assertEquals(expected, actual);
    }


}
