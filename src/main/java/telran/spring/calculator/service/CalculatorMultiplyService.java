package telran.spring.calculator.service;
//IlyaL-51
import org.springframework.stereotype.Service;

@Service
public class CalculatorMultiplyService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		return operandsValid(operands) ? operands[0] * operands[1] : Double.MAX_VALUE;
	}

	@Override
	public String getType() {
		return "*";
	}

}
