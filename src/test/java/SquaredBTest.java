import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquaredBTest {
    @Test
    public void squaredB(){
        int expected = 0;
        int actual = Calculator.squaredB();
        assertEquals(expected, actual);
    }
}
