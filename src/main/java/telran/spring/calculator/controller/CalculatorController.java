package telran.spring.calculator.controller;
//Ilyal-51

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import telran.spring.calculator.CalculatorOperations;
import telran.spring.calculator.dto.CalculatorRequest;
import telran.spring.calculator.service.CalculatorService;
import telran.spring.dto.Message;
import telran.spring.service.SenderService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	@Autowired
	CalculatorOperations calculatorOperations;
	@PostMapping
	String calculate(@RequestBody CalculatorRequest request) {
		CalculatorService service = calculatorOperations.getService4Operation(request.operation);
		if (service == null) {
			return String.format("service %s is not implemented", request.operation);
		}
		if(request.operands.length == 2) {
			Double res=service.calculate(request.operands);
			String itog= "calculation: "+request.operands[0]+" "+request.operation+" "+request.operands[1]+ " = "+res;
			System.out.println(itog);
//			return "calculation has been done - see logs";
			return itog;

		} else  {
			String errorMessage = String.format("Incorrect number of operands is %d\n", 
												request.operands.length);
			System.out.printf(errorMessage);
			return errorMessage;
		}
	}

}
