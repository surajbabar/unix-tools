package surajbab.unixTools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SpaceReducerTest {
    @Test
    public void testReduceSpaces() throws Exception {
        String data = "i     am    a disco dancer";
        SpaceReducer sp = new SpaceReducer();
        String expected = "i am a disco dancer";

        String actual = sp.reduceSpaces(data);

        assertEquals(expected,actual);
    }
}
