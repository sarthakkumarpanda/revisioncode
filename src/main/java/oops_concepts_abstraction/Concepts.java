package oops_concepts_abstraction;

//What is Abstraction?
//Hiding data implementation

//Complete = 100% abstraction (interface)
//Partial = 0 to 100% abstraction (Abstract Classes)

//Why we cannot make instance variables in an abstract class as abstract ?
//Ans - Since an abstract class cannot be instantiated on its own, 
      //it doesn't make sense to have instance variables in an abstract class

//Can we create Object of Abstract Class ?
//Absolutely NOT

public abstract class Concepts {
	
	public String name;
	int age;
	
	
	//an unimplemented method does not have a body
	//and it has to have an abstract keyword
	//unimplemented method == abstract method
	//abstract method has to be inside an abstract class
	public abstract void start();
	
	public void normalTest() {
		
	}

}
