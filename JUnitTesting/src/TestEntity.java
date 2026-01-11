import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEntity {

    @Test
    public void testEntityConstruction() {
        Entities ent = new Entities("John", 10, 100);

        assertEquals("John", ent.getName());
        assertEquals(80, ent.getDamage());
        assertEquals(100, ent.getHealth());
    }
}





