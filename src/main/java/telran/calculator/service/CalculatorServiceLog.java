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
		for (double op : operands) {
			System.out.println(Math.log(op));
		}
	}

}
