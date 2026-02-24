public class Duck extends Animal implements Flyable,Swimmable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public String fly() {
        return "Có thể bay";
    }

    @Override
    public String swim() {
        return "Có thể bơi";
    }
}
