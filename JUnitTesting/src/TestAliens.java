import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAliens {

    Aliens a = new Aliens("CX 700", 100, 100, 50, 50);
    @Test

    public void TestAliensConstructor() {


        assertEquals("CX 700", a.getName());
        assertEquals(100, a.getDamage());
        assertEquals(100, a.getHealth());
        assertEquals(50, a.getPoison());
        assertEquals(50, a.getBite());

    }

    @Test

    public void testGetDamage() {
        assertEquals(100, a.getDamage());
    }
}
