package Interface;

public class Employee implements Salary {

    private String name;
    private int age;
    private double baseSalary;
       
    public Employee(String name, int age, double baseSalary){
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
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
    
    @Override
    public double getSalary() {
        return baseSalary;
    }
    
}
