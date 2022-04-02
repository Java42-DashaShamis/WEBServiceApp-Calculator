package telran.calculator.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.tomcat.util.json.JSONParser;


public class InputText {
	public String operationType;
	public ArrayList<Double> operands;
	public String ops;
	public InputText(String operationType, Double[] operandsString) {
		this.operationType = operationType;
		this.operands = new ArrayList<Double>(Arrays.asList(operandsString));
	}
	public InputText() {
	}
}
