import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import otherclasses.Calculator;

public class TestCalulator {

	Calculator calc = new Calculator();
	public static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Random rand = new Random();
	Double num1;
	Double num2;
	
	@Test
	public void testAdd() {
		for (int i = 0; i < 100; i++){
			num1 = rand.nextDouble()*100*i;
			num2 = rand.nextDouble()*1000*i;
			LOG.info("Testing testAdd with values " + num1 + " and " + num2);
			assertEquals(num1+num2, calc.add(num1, num2), 0.001);
		}
	}

	@Test
	public void testSubtract() {
		for (int i = 0; i < 100; i++){
			num1 = rand.nextDouble()*100*i;
			num2 = rand.nextDouble()*100*i;
			LOG.info("Testing testSubtract with values " + num1 + " and " + num2);
			assertEquals(num1-num2, calc.subtract(num1, num2), 0.001);
		}
	}

	@Test
	public void testMultiply() {
		for (int i = 0; i < 100; i++){
			num1 = rand.nextDouble()*100*i;
			num2 = rand.nextDouble()*100*i;
			LOG.info("Testing testMultiply with values " + num1 + " and " + num2);
			assertEquals(num1*num2, calc.multiply(num1, num2), 0.001);
		}
	}

	@Test
	public void testDivide() {
		for (int i = 0; i < 100; i++){
			num1 = rand.nextDouble()*100*i;
			num2 = rand.nextDouble()*100*i;
			LOG.info("Testing testDivide with values " + num1 + " and " + num2);
			assertEquals(num1/num2, calc.divide(num1, num2), 0.001);
		}
	}
	
	@Test
	public void testDivideByZero() {
		num1 = rand.nextDouble()*100;
		num2 = 0.0;
		LOG.info("Testing testDivide with values " + num1 + " and " + num2);
		assertEquals(num1/num2, calc.divide(num1, num2), 0.001);
		LOG.info("Result equals " + num1/num2);		
	}


}
