package Abstraction;

abstract class Employee {

    private String name;
    private int age;
       
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
   
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
   
    public String showInfo(){
        return "name : " + name + ", age : " + age;
    }
    
    public abstract double getSalary();

}
