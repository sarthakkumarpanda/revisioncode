package oops_concepts_polymorphism_methodoverriding;

public class Handle extends Poly_Ride{

	public static void main(String[] args) {
		
		Handle child = new Handle();
		display();
		child.display();
		
		Poly_Ride parent = new Poly_Ride();
		parent.display();
		
		Handle child1 = (Handle) new Poly_Ride();
		
		Poly_Ride parent1 = new Handle();

	}
	
	public static void display() {
	System.out.println("Child's display");	
	}

}
