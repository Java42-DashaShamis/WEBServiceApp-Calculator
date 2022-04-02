package telran.calculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import telran.calculator.service.CalculatorService;

@Component
public class Sender {
	Map<String, CalculatorService> mapServices;
	
	@Autowired 
	public Sender(List<CalculatorService> services) {
		mapServices = services.stream().collect(Collectors.toMap(CalculatorService::operationType, s->s));
	}
	
	public Sender() {
	}
	
	public String getSenderGreeting() {
		return "Hi, I'm a sender";
	}
	
	public CalculatorService getServiceByType(String type) {
		return mapServices.get(type);
	}
}
