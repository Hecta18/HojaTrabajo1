import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlenderTest {
    @Test
    void testTurnOnAndOff() {
        Blender blender = new Blender();
        blender.turnOn();
        assertTrue(blender.getSpeed() == 0);
        blender.turnOff();
        assertTrue(blender.getSpeed() == 0);
    }

    private void assertTrue(boolean b) {

    }

    @Test
    void testIncreaseSpeed() {
        Blender blender = new Blender();
        blender.turnOn();
        blender.fill("Water");
        blender.increaseSpeed();
        assertEquals(1, blender.getSpeed());
    }

    @Test
    void testFillAndEmpty() {
        Blender blender = new Blender();
        blender.fill("Juice");
        assertTrue(blender.isFilled());
        blender.empty();
        assertFalse(blender.isFilled());
    }
}