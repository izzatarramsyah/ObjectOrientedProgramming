package Class_Object_Inheritance_Polymorphism;

public class Employee {

    // attribute
    private String name;
    private int age;
    
    // constructor
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    // gett and setter  
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name; 
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age; 
    }

    public String toString(){
        return "name : " + name + ", age : " + age;
    }
    
}
