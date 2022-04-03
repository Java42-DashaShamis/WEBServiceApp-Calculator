package telran.calculator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServicePlus implements CalculatorService {
	
	@Override
	public String operationType() {
		return "+";
	}
	@Override
	public void send(ArrayList<Double> operands) {
		// V.R. What will be in case of operands.size()==1? Or 0? Or 5?
		System.out.println(operands.stream().reduce((d1, d2) -> d1 + d2).get());
	}
}
