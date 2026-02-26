public class Patient {
    private String id;
    private String fullName;
    private int age;
    private String diagnosis;

    public Patient(String id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public void displayPatient(){
        System.out.println("| ID: " + this.id + " | FullName: " + this.fullName + " | Age: " + age + " | Diagnosis: " + this.diagnosis + " |");
    }
}
