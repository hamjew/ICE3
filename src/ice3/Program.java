package ice3;

public class Program {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee("John", 25.2, 92);
        Manager manager1 = new Manager("Barney", 20.5, 98, 115, 80);
        SalesAssociate sales1 = new SalesAssociate("Fred", 18.3, 98, 80);
        employee1.printEmployee();
        employee1.calculatePay();
        manager1.printManager();
        manager1.calculatePay();
        sales1.printSales();
        sales1.calculatePay();
    }
    
}
