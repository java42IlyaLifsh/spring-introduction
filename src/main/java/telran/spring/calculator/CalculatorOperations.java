package telran.spring.calculator;
//IlyaL-HW51

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import telran.spring.calculator.service.CalculatorService;

@Component
public class CalculatorOperations {
	
	public Map<String, CalculatorService> mapServices;
	@Autowired
	 CalculatorOperations(List<CalculatorService> services) {
		mapServices = services.stream().collect(Collectors.toMap(CalculatorService::getType, s -> s));
	}
	
	public CalculatorOperations() {
		
	}
	
	public CalculatorService getService4Operation(String type) {
		return mapServices.get(type);
	}
	
	public String greetingMessage() {
		return "I am WEB Calculator. I can calculate: " + mapServices.keySet();
	}
	
}
