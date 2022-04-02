package telran.spring.calculator.dto;
//IlyaL-51


public class CalculatorRequest {

public String operation;
public double[] operands;
public CalculatorRequest() {
}
public CalculatorRequest(String operation, double[] operands) {
	this.operation = operation;
	this.operands = operands;
}

}
