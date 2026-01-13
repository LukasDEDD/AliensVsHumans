import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {


    @Test
    public void testmain() {

        Humans a = new Humans("John", 200, 150, 150, 100);
        Aliens b = new Aliens("xc700", 80, 100, 80, 50);

        Main.battle(a,b);
            assertEquals(20, a.getHealth());
            assertEquals(0, b.getHealth());
        }
    }
