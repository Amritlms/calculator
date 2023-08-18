package practice.calculator.folder;

public class Calculator {
	private help s;

	public Calculator(help s) {
	this.s=s;
	}

	public void run() {
		s.sum();
		s.sub();
		s.Multi();
		s.div();
	}

}
