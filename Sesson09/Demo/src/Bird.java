import java.util.Scanner;

public class Bird extends Animal {
    private boolean isFly;
    private String birdSound;

    public Bird(String animalName, int numberOfLegs, String furColor, double everageLifeExpectancy, boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public boolean getIsFly() {
        return isFly;
    }

    public void setIsFly(boolean isFly) {
        this.isFly = isFly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input(){
        super.input();

        Scanner sc = new Scanner(System.in);
        System.out.print("Có bay được không (true/false): "); isFly = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Tiếng hót: "); birdSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" | Có thể bay: " + (isFly ? "Có" : "Không") + " | Tiếng hót: " + birdSound);
    }
}
