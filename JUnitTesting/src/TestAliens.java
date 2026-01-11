import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAliens {

    private  int a = 100;
    private  int b = 50;
    private  int c = 24;

    Aliens al = new Aliens();

    @Test

    public void TestAliens () {

        assertEquals(0, al.health(a));
        assertEquals(70, al.health(b));
        assertEquals(80, al.health(c));

    }
}
