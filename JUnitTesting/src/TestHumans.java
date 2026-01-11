import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHumans {

    private  int a = 100;
    private  int b = 50;
    private  int c = 24;

    Humans h = new Humans();

    @Test

    public void testHuman () {

        assertEquals(0, h.health(a));
        assertEquals(50, h.health(b));
        assertEquals(75, h.health(c));

    }
}
