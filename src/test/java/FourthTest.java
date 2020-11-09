import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourthTest {

    @Test
    public void div(){
        int expected = 0;
        int actual = Calculator.div();
        assertEquals(expected, actual);
    }
}
