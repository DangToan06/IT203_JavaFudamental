import java.util.Scanner;

public class Animal {
    private int animalId;
    private String animalName;
    private int numberOfLegs;
    private String furColor;
    private double everageLifeExpectancy;

    public static int idAuto = 0;
    public Animal( String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy) {
        this.animalId = idAuto++;
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public double getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }

    public void setEverageLifeExpectancy(double everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: "); animalName = sc.nextLine();
        System.out.print("Nhập số chân: "); numberOfLegs = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập màu lông: "); furColor = sc.nextLine();
        System.out.print("Nhập tuổi thọ TB: "); everageLifeExpectancy = Double.parseDouble(sc.nextLine());
    }

    public void display() {
        System.out.print("Tên: " + animalName + " | Chân: " + numberOfLegs +
                " | Màu lông: " + furColor + " | Tuổi thọ: " + everageLifeExpectancy);
    }
}
