package Class_Object_Inheritance_Polymorphism;

public class MainClass {

    public static void main(String[] args) {
        // create object from class
        Employee employee = new Employee("Joe", 30);
        System.out.println(employee.toString());

        Manager manager = new Manager("Joe", 30, 1000000 , 1000000);
        System.out.println(manager.toString());
        System.out.println(manager.toString("Method toString overriding -> "));

    }
    
}
