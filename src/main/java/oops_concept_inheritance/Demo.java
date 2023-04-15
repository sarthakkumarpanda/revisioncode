package oops_concept_inheritance;
//Inheritance
//Child(sub/child class) - inherits properties of its parent/Super Class

//Advantages
//Code-reusability
//We can use polymorphism

//Disadvantage
//2 tightly coupled classes

public class Demo extends Architect{ 
	
	public Demo() {
		System.out.println("This is parent's Constructor");
	}

	public String properties_definitions;
	public int cash;
	
	public void oldLogic() {
		System.out.println("Parent's old logic method");
	}
	
	public void oldWine() {
		System.out.println("Parent's old wine");
	}
	
	private void secret() {
		System.out.println("This is private method of parent");
	}
}
