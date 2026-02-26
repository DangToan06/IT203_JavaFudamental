import java.util.LinkedList;

public class EmergencyRoom {
    LinkedList<String> listPatients = new LinkedList<>();

    public void patientCheckIn(String name){
        listPatients.add(name);
        System.out.println("Thêm bệnh nhân " + name +" vào cuối hàng đợi");
    }

    public void emergencyCheckIn(String name){
        listPatients.addFirst(name);
        System.out.println("Đã thêm bệnh nhân "+ name + " nguy kich vào đầu");
    }

    public void treatPatient(){
        String first = listPatients.getFirst();
        listPatients.removeFirst();
        System.out.println("Đang khám: " + first);
    }
}
