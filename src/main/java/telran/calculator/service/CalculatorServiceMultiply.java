package telran.calculator.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceMultiply implements CalculatorService {

	@Override
	public String operationType() {
		return "*";
	}

	@Override
	public void send(ArrayList<Double> operands) {
		System.out.println(operands.stream().reduce((d1, d2) -> d1 * d2).get());
	}

}
