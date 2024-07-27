package Class_Object_Inheritance_Polymorphism;

public class Manager extends Employee {

    private int baseSalary;
    private int allowance;

    public Manager(String name, int age, int baseSalary, int allowance) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.allowance = allowance;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return super.toString() + baseSalary + ", allowance : " + allowance ;
    }
    
    public String toString(String str){
        return str + super.toString() + baseSalary + ", allowance : " + allowance ;
    }

    
}
