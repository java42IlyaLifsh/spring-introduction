package telran.spring;

import org.springframework.stereotype.Component;

@Component
public class Sender {
public Sender() {
	System.out.println("Sender constructor");
}
public String getSenderGreeting() {
	return "Hi, I'm a sender";
}

}
