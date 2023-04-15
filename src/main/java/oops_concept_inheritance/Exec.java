package oops_concept_inheritance;

public class Exec extends Demo { // Exec is the sub/child and Demo is the parent/super class

	public static void main(String[] args) {

		Demo demo = new Demo();
		System.out.println(demo.cash = 100000);
		System.out.println(demo.properties_definitions = "BankPapers");
		demo.oldLogic();
		demo.oldWine();
		

		Exec child = new Exec();
		child.bike();
		child.car();
		child.oldLogic();
		child.oldWine();
		
		child.structure();
		
	}

	public Exec() {
		super();
	}

	public void bike() {
		System.out.println("Child's bike");
	}

	public void car() {
		System.out.println("Child's car");
	}

}
