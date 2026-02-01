public class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }else{
            System.err.println("Gia khong hop le !!!");
        }
    }

    public void displayProduct() {
        System.out.println("Sản phẩm: " + productName + " | Mã: " + productId + " | Giá: " + price);
    }
}
