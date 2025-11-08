import org.example.Calculator;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest
{
	@Test
	public void testAdd()
	{
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        Assert.assertEquals(3, result);
    }
}


