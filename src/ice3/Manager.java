package ice3;

public class Manager extends Employee{
    
    private double bonus;
    private double vacPay;
    
    public Manager(String name, double wage, double hours, double bonus, double vacPay) {
        super(name, wage, hours);
        this.bonus = bonus;
        this.vacPay = vacPay;
    }
    
    @Override
    public void calculatePay(){
        double pay = super.getHours() * super.getWage() + this.vacPay + this.bonus;
        System.out.printf("Manager Name : %s Pay : %.2f\n", super.getName(), pay);
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    public double getBonus(){
        return this.bonus;
    }
    
    public void setvacPay(double vacPay){
        this.vacPay = vacPay;
    }
    
    public double getvacPay(){
        return this.vacPay;
    }
    
    public void printManager(){
        System.out.println("This is the Manager class");
    }
    
}
