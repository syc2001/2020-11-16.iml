package test15;

public class Employee {
    private int number;
    private String name;
    private double salary;
    private double salaryrate;
    public Employee(int number,String name,float salary,float salaryrate){
        this.number=number;
        this.name=name;
        this.salary=salary;
        this.salaryrate=salaryrate;
    }



    public void salary(){
        salary=salary*salaryrate;

    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryrate() {
        return salaryrate;
    }

    public void setSalaryrate(double salaryrate) {
        this.salaryrate = salaryrate;
    }

}
