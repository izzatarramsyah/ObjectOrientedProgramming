package Abstraction;

public class Manager extends Employee{

    private int baseSalary;
    private int allowance;

    public Manager(String name, int age, int baseSalary, int allowance) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.allowance = allowance;
    }

    @Override
    public double getSalary() {
        return baseSalary + allowance;
    }

}
