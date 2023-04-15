package oops_concepts_abstraction;
//100% abstraction
//similar to abstract class

//Definition of interface: -

//An interface in Java can be defined as a blueprint of a class. 
//It specifies the methods that a class should implement, 
//but it does not provide any implementation details of those methods. 
//In other words, an interface tells a class what it must do but does not tell the class how to do it. 
//The implementation details of the methods are left to the implementing class.

public interface Knowledge {
	
	//all the variables declared inside an interface is final
	//variables - public static and final in nature
	
	public static final int i = 10;
	String name = "Don";
	
	//abstract methods
	
	void display();
	public abstract void displayDemo();
	
	//Regular non-static method with default keyword - is allowed
	//Other access modifiers are not allowed with non-static methods
	
	default void initialize() {
	
	}
	
	public static void health() {
		
	}
	
	
	

}
