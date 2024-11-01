public class Student {
    String name, lastName;
    int age;
    
    public Student() {
        name = "No name yet.";
        age = 0;
    }
    

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Student (String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    


}