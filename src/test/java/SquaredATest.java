import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquaredATest {

    @Test
    public void squaredA(){
        int expected = 0;
        int actual = Calculator.squaredA();
        assertEquals(expected, actual);
    }
}
