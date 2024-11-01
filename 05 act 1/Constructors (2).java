
public class Constructors
{
	public static void main(String[] args) {
	    
	    Student s = new Student();
	    Student s1 = new Student("Junas Miguel ", "Rama ", 19);
	    Student s2 = new Student("Junas ", "Rama ", 19);
	    
	    System.out.println(s.name + s.age);
	    System.out.println(s1.name + s1.lastName + s1.age);
	    System.out.println(s2.name + s2.lastName + s2.age);
	    
	}
}
