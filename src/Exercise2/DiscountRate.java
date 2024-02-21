package Exercise2;

interface DiscountRate {
    double getServiceMemberDiscount();
    double getProductMemberDiscount();
}

class Customer implements DiscountRate {
    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        switch (customerType.toLowerCase()) {
            case "premium":
                return 0.20;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductMemberDiscount() {
        switch (customerType.toLowerCase()) {
            case "premium":
            case "gold":
            case "silver":
                return 0.10;
            default:
                return 0.0;
        }
    }
}

class Sale {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = 0.0;
        this.productExpense = 0.0;
    }

    public String getDate() {
        return date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    public void displayInfo() {
        System.out.println("Date: " + date);
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Customer Type: " + customer.getCustomerType());
        System.out.println("Service Expense: $" + serviceExpense);
        System.out.println("Product Expense: $" + productExpense);
        System.out.println("Total Expense: $" + getTotalExpense());
        System.out.println("Service Member Discount: $" + (serviceExpense * customer.getServiceMemberDiscount()));
        System.out.println("Product Member Discount: $" + (productExpense * customer.getProductMemberDiscount()));
    }
}