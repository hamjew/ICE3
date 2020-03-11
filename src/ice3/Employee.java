package ice3;

public class Employee {
    
    private String name;
    private double wage;
    private double hours;
    
    public Employee(String name, double wage, double hours){
        this.name = name;
        this.wage = wage;
        this.hours = hours;
    }
    
    public void calculatePay(){
        double pay = this.hours * this. wage;
        System.out.printf("Employee Name : %s Pay : %.2f\n", this.name, pay);
    };
    
    public void printEmployee(){
        System.out.println("This is the Employee Class");
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setWage(double wage){
        this.wage = wage;
    }
    
    public double getWage(){
        return this.wage;
    }
    
    public void setHours(double hours){
        this.hours = hours;
    }
    
    public double getHours(){
        return this.hours;
    }
    
}
