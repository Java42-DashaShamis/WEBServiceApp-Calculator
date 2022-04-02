package telran.calculator.service;

import java.util.ArrayList;

public interface CalculatorService {
	String operationType();
	void send(ArrayList<Double> operands);
}
