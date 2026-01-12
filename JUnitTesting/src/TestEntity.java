import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEntity {

    @Test
    public void testEntityConstruction() {
        Entities ent = new Entities("John", 10, 120);

        assertEquals("John", ent.getName());
        assertEquals(10, ent.getDamage());
        assertEquals(120, ent.getHealth());
    }
}





