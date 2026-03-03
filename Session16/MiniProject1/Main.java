package Session16.MiniProject1;

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static PetManager petManager = new PetManager();
    static CustomerManager customerManager = new CustomerManager();
    static SpaService spaService = new SpaService();
    static ActivityLog log = new ActivityLog();
    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addPet();
                    break;
                case 2:
                    showPets();
                    break;
                case 3:
                    registerCustomer();
                    break;
                case 4:
                    addToSpa();
                    break;
                case 5:
                    undo();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    static void printMenu() {
        System.out.println("===== PET KINGDOM =====");
        System.out.println("1. Add Pet");
        System.out.println("2. Show Pets");
        System.out.println("3. Register Customer");
        System.out.println("4. Spa Service");
        System.out.println("5. Undo");
        System.out.println("0. Exit");
    }
    static void addPet() {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Species: ");
        String species = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        Pet pet = new Pet(id, name, species, price);
        petManager.add(pet);
        log.log("Added pet " + id);
    }
    static void showPets() {
        for (Pet pet : petManager.getAll()) {
            System.out.println(pet);
        }
    }
    static void registerCustomer() {
        System.out.print("Customer ID: ");
        String cid = sc.nextLine();
        System.out.print("Name: ");
        String cname = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        Customer customer = new Customer(cid, cname, phone);
        if (customerManager.register(customer)) {
            log.log("Registered customer " + cid);
        } else {
            System.out.println("Customer already exists!");
        }
    }
    static void addToSpa() {
        System.out.print("Enter Pet ID for spa: ");
        String pid = sc.nextLine();
        Pet spaPet = petManager.findById(pid);
        if (spaPet != null) {
            spaService.addToQueue(spaPet);
            log.log("Pet " + pid + " added to spa queue");
        } else {
            System.out.println("Pet not found!");
        }
    }
    static void undo() {
        System.out.println("Undo: " + log.undo());
    }
}
