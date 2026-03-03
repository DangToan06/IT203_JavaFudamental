package Session16.MiniProject1;

public class Pet {
    private String id;
    private String name;
    private String species;
    private double price;

    public Pet(String id, String name, String species, double price) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", price=" + price +
                '}';
    }
}
