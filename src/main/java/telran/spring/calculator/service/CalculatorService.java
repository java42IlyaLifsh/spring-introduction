package telran.spring.calculator.service;
//IlyaL-HW51


public interface CalculatorService {
	double calculate(double[] operands);
	String getType();
	
	default boolean operandsValid(double[] operands) {
		return operands.length == 2;
	}
	
}
