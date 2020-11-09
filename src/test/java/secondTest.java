import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class secondTest {

    @Test
    public void sub(){
        int expected = 0;
        int actual = Calculator.sub();
        assertEquals(expected, actual);
    }
}
