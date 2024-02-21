package Exercise2;
public class Main {
    public static void main(String[] args) {
        Customer premiumCustomer = new Customer("Panha", "Premium");
        Sale premiumSale = new Sale(premiumCustomer, "2024-02-21");
        premiumSale.setServiceExpense(100.0);
        premiumSale.setProductExpense(50.0);
        premiumSale.displayInfo();
    }
}
