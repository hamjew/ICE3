package ice3;

public class SalesAssociate extends Employee{
    
    private double vacPay;
    
    public SalesAssociate(String name, double wage, double hours, double vacPay){
        super(name, wage, hours);
        this.vacPay = vacPay;
    }
    
    @Override
    public void calculatePay(){
        double pay = super.getHours() * super.getWage() + this.vacPay;
        System.out.printf("Sales Name : %s Pay : %.2f\n", super.getName(), pay);
    }
    
    public void setvacPay(double vacPay){
        this.vacPay = vacPay;
    }
    
    public double getvacPay(){
        return this.vacPay;
    }
    
    public void printSales(){
        System.out.println("This is the SalesAssociate class");
    }
    
}
