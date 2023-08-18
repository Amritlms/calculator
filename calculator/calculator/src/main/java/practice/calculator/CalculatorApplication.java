package practice.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import practice.calculator.folder.Calculator;
import practice.calculator.folder.Division;
import practice.calculator.folder.Multi1;
import practice.calculator.folder.sub1;
import practice.calculator.folder.sum1;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		//sum1 s=new sum1();
		//sub1 s=new sub1();
		//Multi1 s=new Multi1();
		Division s=new Division();
		Calculator c=new Calculator(s);
		c.run();
	}

}
