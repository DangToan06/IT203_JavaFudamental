
void main() {
    Drink[] drinks = new Drink[3];
    drinks[0] = new Coffee("001", "Bạc xỉu", 30000, true);
    drinks[1] = new FruitJuice("002", "Nước cam", 40000, 10);
    drinks[2] = null;

    for (Drink drink : drinks) {
        if (drink != null) {
            drink.displayInfo();
            if (drink instanceof IMixable) {
                ((IMixable) drink).mix();
            }
            System.out.println("Thành tiền: " + drink.calculatePrice());
        }
    }
}
