package oops_concepts_polymorphism_methodoverloading;
//poly means many
//morphism means many forms

//Types:-
//Compile Time polymorphism(Static polymorpishm)
//1. It is achieved by Method overloading
//2. Method name should be same. Class same. Different arguments/parameters
//3. Handled by the compiler

public class Poly_Load {
	
	
	public static void main(String[] args) {
		logic();
		logic(10);
		logic("Hello");
		logic(1, 4);
		logic(new StringBuilder("Dummy"));
	}
	
	public static void logic() {
		System.out.println("This is a simple logic method");
	}
	
	public static void logic(int i) {
		System.out.println("This is a single int paremeterized logic method");
	}
	
	public static void logic(String S1) {
		System.out.println("This is a single String paremeterized logic method");
	}
	
	public static void logic(int i, int j) {
		System.out.println("This is a multiple int paremeterized logic method");
	}
	
	public static void logic(StringBuilder S3) {
		System.out.println("This is a single StringBuilder paremeterized logic method");
	}

}
