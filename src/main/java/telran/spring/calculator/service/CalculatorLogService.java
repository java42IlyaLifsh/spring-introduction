package telran.spring.calculator.service;
//IlyaL-HW51

import org.springframework.stereotype.Service;

@Service
public class CalculatorLogService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		return operandsValid(operands) ? 
				Math.log(operands[1]) / Math.log(operands[0]) : 
				Double.NEGATIVE_INFINITY;
	}

	@Override
	public String getType() {	return "log";
	}
}
