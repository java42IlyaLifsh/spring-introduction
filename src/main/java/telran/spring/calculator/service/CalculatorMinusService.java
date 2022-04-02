package telran.spring.calculator.service;
//IlyaL-HW51
import org.springframework.stereotype.Service;

@Service
public class CalculatorMinusService implements CalculatorService {

	@Override
	public double calculate(double[] operands) {
		return operandsValid(operands) ? operands[0] - operands[1] : Double.NEGATIVE_INFINITY;
	}

	@Override
	public String getType() {
		return "-";
	}

}

