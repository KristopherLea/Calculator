import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubedTest {
    @Test
    public void cubeA(){
        int expected = 0;
        int actual = Calculator.cubeA();
        assertEquals(expected, actual);
    }
}
