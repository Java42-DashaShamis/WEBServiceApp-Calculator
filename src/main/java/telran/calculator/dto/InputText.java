package telran.calculator.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.tomcat.util.json.JSONParser;

// The class name isn't so suitable. May be Request is better?
public class InputText {
	public String operationType;
	// V.R. Why ArrayList is better than array?
	public ArrayList<Double> operands;
	public String ops;
	public InputText(String operationType, Double[] operandsString) {
		this.operationType = operationType;
		this.operands = new ArrayList<Double>(Arrays.asList(operandsString));
	}
	public InputText() {
	}
}
