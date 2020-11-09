import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class firstTest {

    @Test
    public void add(){
        int expected = 0;
        int actual = Calculator.add();
        assertEquals(expected, actual);
    }
}
