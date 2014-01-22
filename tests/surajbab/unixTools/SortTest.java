package surajbab.unixTools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SortTest {
    @Test
    public void testSortDataInAscendingOrder() throws Exception {
        String data = "b\r\nc\r\na";
        String expected = "a\r\nb\r\nc\r\n";
        Sort sort = new Sort();

        String actual = sort.sort(data);

        assertEquals(expected, actual);
    }

    @Test
    public void testSortDataInDescendingOrder() throws Exception {
        String data = "b\r\nc\r\na";
        String expected = "c\r\nb\r\na\r\n";
        Sort sort = new Sort();

        String actual = sort.sort(data, 'r');

        assertEquals(expected, actual);

    }

}
