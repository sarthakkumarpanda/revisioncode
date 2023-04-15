package oops_concepts_constructor;
//it is a block which is similar to a method but it is not a method

//Methods vs constructors
//1. Constructor has the Class name but methods do not
//2. Constructor does not have a return type but methods do
//3. Constructor gets created the moment an Object is created but that does not apply to Methods
//4. Methods can be used in inheritance but Constructors cannot be inherited
//5. Constructors cannot be made static but methods can be made static

//Constructors can be used with all the access modifiers - public, private, protected, default

//Uses - used to initialize an object, used to optimize code

//Types- 
//1. Default constructor - compiler generates the moment object is created
//2. No argument constructor - user defined
//3. Parameterized constructor - user defined

//Misconception - Constructors are used to create Objects (X) 

public class Constructors_Concepts {
	
	String name; //default value is ? null
	int age;     //default value is ? 0
	String subject; //null
	
	public static void main(String[] args) {
		Constructors_Concepts student1 = new Constructors_Concepts("Tom", 5, "English");	
		System.out.println(student1.name + " -- " + student1.age + " -- " + student1.subject);
		
		Constructors_Concepts student2 = new Constructors_Concepts("Harry", 5, "French");
		System.out.println(student2.name + " -- " + student2.age + " -- " + student2.subject);
		}
	
	
	public Constructors_Concepts(String name_local, int age, String subject) {
		name = name_local;
		this.age = age;
		this.subject=subject;
	}
	
	
	
	

}
