public class Rectangle extends Shape{
    private double width;
    private double height;
    private String type;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.type = "Hình chữ nhật (" + width + " x " + height + ")";
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
        this.type = "Hình vuông (cạnh " + side + ")";
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public String getType() {
        return type;
    }
}
