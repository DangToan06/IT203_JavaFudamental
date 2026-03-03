public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price,  int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    double calculateFinalPrice() {
        if(warrantyMonths > 12){
            return getPrice() + 1000000;
        }else {
            return getPrice();
        }
    }

    @Override
    void displayInfo() {
        System.out.println("------------------------");
        super.displayInfo();
        System.out.println("Warranty Months: " + warrantyMonths + " Tháng");
    }
}
