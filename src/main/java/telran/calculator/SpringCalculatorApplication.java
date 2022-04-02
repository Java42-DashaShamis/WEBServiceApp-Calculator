package telran.calculator;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCalculatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCalculatorApplication.class, args);
		Sender sender = ctx.getBean(Sender.class);
		System.out.println(sender.getSenderGreeting());
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter exit for graceful shutdown");
			String line = scanner.nextLine();
			if(line.equals("exit")) {
				ctx.close();
				break;
			}
		}
	}

}
