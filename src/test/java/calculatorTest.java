import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        Assertions.assertEquals(9,calculator.add(4,5));
    }

    @Test
    public void failAdd(){
        Assertions.assertEquals(8,calculator.add(4,5));
    }
}
