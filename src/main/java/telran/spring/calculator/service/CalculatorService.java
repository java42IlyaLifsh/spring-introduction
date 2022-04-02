package telran.spring.calculator.service;
//IlyaL-HW51


public interface CalculatorService {
	double calculate(double[] operands);
	String getType();
	// V.R. Look at CalculatorController.java, line 27
	// One of these checks is redundant
	default boolean operandsValid(double[] operands) {
		return operands.length == 2;
	}
}
