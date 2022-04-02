package telran.calculator.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telran.calculator.Sender;
import telran.calculator.dto.InputText;
import telran.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class SenderController {
	@Autowired
	Sender sender;
	@PostMapping
	public String sendResult(@RequestBody InputText inputText) {
		CalculatorService service = sender.getServiceByType(inputText.operationType);
		if(service == null) {
			return String.format("operation %s is not implemented", inputText.operationType);
		}
		service.send(inputText.operands);
		return "input data has been sent to calculator - see logs for result";
	}
}
