package Interface;

public class MainClass {
 
    public static void main(String[] args) {
        Manager manager = new Manager("Joe", 30, 1000000, 10000);
        System.out.println( manager.showInfo());
        System.out.println( manager.getSalary());

    }

}
