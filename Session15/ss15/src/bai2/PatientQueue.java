package bai2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<Patient>();
    }

    public void addPatient(Patient p){
        queue.add(p);
        System.out.println("Đã thêm: " + p.getName());
    }

    public Patient callNextPatient(){
        if(queue.isEmpty()){
            System.out.println("Hàng đợi trống");
            return null;
        }
        return queue.poll();
    }

    public Patient peekNextPatient(){
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Không có bệnh nhân nào đang chờ.");
            return;
        }else {
            System.out.println("\n--- DANH SÁCH BỆNH NHÂN ĐANG CHỜ ---");
            for (Patient p : queue) {
                System.out.println(p);
            }
        }
    }
}
