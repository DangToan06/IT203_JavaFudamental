public class FoodProduct extends  Product {
    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    double calculateFinalPrice() {
        return getPrice() - (getPrice()*discountPercent/100) ;
    }

    @Override
    void displayInfo() {
        System.out.println("------------------------");
        super.displayInfo();
        System.out.println("Discount Percent: " + discountPercent +"%");
    }
}
