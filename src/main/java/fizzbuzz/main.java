package fizzbuzz;

import java.util.Map;
import java.util.HashMap;
import fizzbuzz.Constants;

public class main {
	 private static FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
	 private static Map<String,Integer> fizzBuzzMap = new HashMap<String, Integer>();


	public static void main(String[] args) {
		int n = 100;

		System.out.println("Count: " + n);
		System.out.println("\n-----FIZZ BUZZ-----");
		System.out.println(convertToFizzBuzz(n));
		System.out.println("\n-----FIZZ BUZZ LUCKY-----");
		System.out.println(convertToFizzBuzzLucky(n));
	        
	    
        for (Map.Entry<String,Integer> entry : fizzBuzzMap.entrySet())  
            System.out.println(entry.getKey() + 
                             ": " + entry.getValue()); 
    } 
	
	public static String convertToFizzBuzz(int count) {
		StringBuilder returnVal = new StringBuilder();
		if(count > 1)
			for (int i=1; i<=count; i++) {
				returnVal.append(fizzBuzz.convertToFizzBuzz(i) + " ") ;
	        }
		else 
			returnVal.append(count);
		
		return returnVal.toString();
	}
	
	public static String convertToFizzBuzzLucky(int count) {
		StringBuilder returnVal = new StringBuilder();
		if(count > 1)
			for (int i=1; i<=count; i++) {
				String val = fizzBuzz.convertToFizzBuzzLucky(i);
				returnVal.append(val + " ") ;
				getCounts(val);
	        }
		else 
			returnVal.append(count);
		return returnVal.toString();
		
	}
	    
	public static void getCounts(String val) {
		if(val.contentEquals(Constants.FIZZ) || val.contentEquals(Constants.BUZZ) || val.contentEquals(Constants.FIZZ_BUZZ) || val.contentEquals(Constants.LUCKY))
     		if(fizzBuzzMap.containsKey(val))
     			fizzBuzzMap.put(val, fizzBuzzMap.get(val).intValue() + 1);
     		else 
     			fizzBuzzMap.put(val, 1);
 		else
     		if(fizzBuzzMap.containsKey(Constants.INTEGER))
     			fizzBuzzMap.put(Constants.INTEGER, fizzBuzzMap.get(Constants.INTEGER).intValue() + 1);
     		else
     			fizzBuzzMap.put(Constants.INTEGER, 1);


	}

	public static Map<String, Integer> getFizzBuzzMap() {
		return fizzBuzzMap;
	}

	public static void setFizzBuzzMap(Map<String, Integer> fizzBuzzMap) {
		main.fizzBuzzMap = fizzBuzzMap;
	}

}
