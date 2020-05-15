package fizzbuzz;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import fizzbuzz.Constants;

import junit.framework.Assert;

public class FizzBuzzConverterTest {
	
	FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
	
	@Test
    public void testFizzBuzz(){
	 	String returnVal = "";

        returnVal = main.convertToFizzBuzz(15);
        Assert.assertEquals(returnVal, Constants.TEST_FB_15);
        
        returnVal = main.convertToFizzBuzz(20);
        Assert.assertEquals(returnVal, Constants.TEST_FB_20);
        
        returnVal = main.convertToFizzBuzz(50);
        Assert.assertEquals(returnVal, Constants.TEST_FB_50);
        
        returnVal = main.convertToFizzBuzz(100);
        Assert.assertEquals(returnVal, Constants.TEST_FB_100);
        
        returnVal = main.convertToFizzBuzz(1);
        Assert.assertEquals(returnVal, "1");
    }
	
	@Test
    public void testFizzBuzzLucky(){
	 	String returnVal = "";
	 	Map<String, Integer> fizzBuzzMap = new HashMap<String, Integer>();
	 	main.setFizzBuzzMap(fizzBuzzMap);
        returnVal = main.convertToFizzBuzzLucky(15);
        Assert.assertEquals(returnVal, Constants.TEST_FBL_15);
        
        returnVal = main.convertToFizzBuzzLucky(20);
        Assert.assertEquals(returnVal, Constants.TEST_FBL_20);
        
        returnVal = main.convertToFizzBuzzLucky(50);
        Assert.assertEquals(returnVal, Constants.TEST_FBL_50);
        
        returnVal = main.convertToFizzBuzzLucky(100);
        Assert.assertEquals(returnVal, Constants.TEST_FBL_100);
        
        returnVal = main.convertToFizzBuzzLucky(1);
        Assert.assertEquals(returnVal, "1");
        
        fizzBuzzMap = main.getFizzBuzzMap();
        
        Assert.assertNotNull(fizzBuzzMap);
    }
	
	@Test
    public void testFizzBuzzConverter_FizzBuzz(){
		String returnVal = "";

        returnVal = fizzBuzz.convertToFizzBuzz(3);
        Assert.assertEquals(returnVal, Constants.FIZZ);
        
        returnVal = fizzBuzz.convertToFizzBuzz(5);
        Assert.assertEquals(returnVal, Constants.BUZZ);
        
        returnVal = fizzBuzz.convertToFizzBuzz(15);
        Assert.assertEquals(returnVal, Constants.FIZZ_BUZZ);
        
        returnVal = fizzBuzz.convertToFizzBuzz(1);
        Assert.assertEquals(returnVal, "1");
    }
	
	@Test
    public void testFizzBuzzConverter_FizzBuzzLucky(){
		 	String returnVal = "";

	        returnVal = fizzBuzz.convertToFizzBuzzLucky(3);
	        Assert.assertEquals(returnVal, Constants.LUCKY);
	        
	        returnVal = fizzBuzz.convertToFizzBuzzLucky(5);
	        Assert.assertEquals(returnVal, Constants.BUZZ);
	        
	        returnVal = fizzBuzz.convertToFizzBuzzLucky(15);
	        Assert.assertEquals(returnVal, Constants.FIZZ_BUZZ);
	        
	        returnVal = fizzBuzz.convertToFizzBuzzLucky(12);
	        Assert.assertEquals(returnVal, Constants.FIZZ);
	        
	        returnVal = fizzBuzz.convertToFizzBuzzLucky(1);
	        Assert.assertEquals(returnVal, "1");
    }

}
