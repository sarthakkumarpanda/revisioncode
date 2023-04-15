package oops_concepts_polymorphism_methodoverloading;

public class MainMethod_Overloaded {

	public static void main(String[] args) {
		System.out.println("This is the original main method");
		main();
		main(10);
		main(args = new String[3], args = new String[4]);
	}

	public static void main() {
		System.out.println("This is a non-param main method");
	}
	
	public static void main(int i) {
		System.out.println("This is an int param main method");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is multi param String Array main method");
	}

}
