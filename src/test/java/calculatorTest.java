import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(9,calculator.add(4,5));
    }
}
