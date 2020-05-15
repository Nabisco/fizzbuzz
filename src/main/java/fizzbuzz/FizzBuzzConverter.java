package fizzbuzz;
import fizzbuzz.Constants;

public class FizzBuzzConverter {

	public String convertToFizzBuzz(int numConvert) {
		String returnVal = "";
		if(numConvert%15 == 0)
			returnVal = Constants.FIZZ_BUZZ;
		else if(numConvert%5 == 0)
			returnVal = Constants.BUZZ;
		else if(numConvert%3 == 0)
			
			returnVal = Constants.FIZZ;
		else
			returnVal = String.valueOf(numConvert);
		
		return returnVal;
		
	}
	
	public String convertToFizzBuzzLucky(int numConvert) {
		String returnVal = "";
		
		if(!String.valueOf(numConvert).contains("3"))
			if(numConvert%15 == 0)
				returnVal = Constants.FIZZ_BUZZ;
			else if(numConvert%5 == 0)
				returnVal = Constants.BUZZ;
			else if(numConvert%3 == 0)
				
				returnVal = Constants.FIZZ;
			else
				returnVal = String.valueOf(numConvert);
		else
			returnVal = Constants.LUCKY;
				
		
		return returnVal;
		
	}

}
