package Abstraction;

public class MainClass {
    
    public static void main(String[] args) {
        Manager manager = new Manager("Joe", 30, 1000000, 100000);
        System.out.println( manager.showInfo() );
        System.out.println( "salary manager : " + manager.getSalary() );

    }

}
