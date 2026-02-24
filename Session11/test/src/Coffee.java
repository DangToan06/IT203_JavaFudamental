public class Coffee extends Drink{
    private boolean hasMilk;

    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if (this.hasMilk == true){
            return getPrice() + 5000;
        }else {
            return getPrice();
        }
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println(hasMilk == true ? "Có sữa" : "Đen đá");
    }
}
