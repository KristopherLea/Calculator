import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdTest {

    @Test
    public void multiply(){
        int expected = 0;
        int actual = Calculator.multiply();
        assertEquals(expected, actual);
    }
}
