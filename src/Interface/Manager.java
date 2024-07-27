package Interface;

public class Manager extends Employee{

    private int allowance;

    public Manager(String name, int age, double totalSalary, int allowance) {
        super(name, age, totalSalary);
        this.allowance = allowance;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + allowance;
    }
    
}
