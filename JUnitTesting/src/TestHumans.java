import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHumans {

    Humans h = new Humans ( "John", 100, 100,50,50);

    @Test

    public void testHumanConstructor () {



            assertEquals("John", h.getName());
            assertEquals(100, h.getDamage());
            assertEquals(100, h.getHealth());
            assertEquals(50, h.getSword());
            assertEquals(50, h.getMagic());
        }

        @Test

    public void testGetDamage (){

        assertEquals(100, h.getDamage());
        }
    }


