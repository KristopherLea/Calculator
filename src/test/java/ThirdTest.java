import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdTest {

    @Test
    public void mult(){
        int expected = 0;
        int actual = Calculator.mult();
        assertEquals(expected, actual);
    }
}
