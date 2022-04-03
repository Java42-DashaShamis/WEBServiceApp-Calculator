package telran.calculator.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceLog implements CalculatorService {

	@Override
	public String operationType() {
		return "log";
	}

	@Override
	public void send(ArrayList<Double> operands) {
		/* V.R. This method prints out the natural logarithm of the single number.
		 * It isn't calculator functionality. It has to use two numbers. 
		 * One of them is the number itself, another one ithe base of
		 * logarithm. and the size of array has to be 2 only.
		 * The example of logarithm implementation was reviewed at the webinar.
		 */
		for (double op : operands) {
			System.out.println(Math.log(op));
		}
	}

}
