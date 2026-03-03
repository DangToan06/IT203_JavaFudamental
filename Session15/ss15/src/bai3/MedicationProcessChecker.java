package bai3;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack;

    public MedicationProcessChecker() {
        this.stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions){
        reset();

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if(action.equalsIgnoreCase("PUSH")){
                stack.push("Tác vụ " + (stack.size() + 1));
                System.out.println("-> PUSH: Đang phát thuốc...");
            }else  if(action.equalsIgnoreCase("PULL")){
                if (stack.isEmpty()) {
                    System.out.println("!!! LỖI: Không thể hoàn tất (POP) vì không có đơn thuốc nào đang phát.");
                    return false;
                }
                stack.pop();
                System.out.println("<- POP: Đã hoàn tất một đơn thuốc.");
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("!!! LỖI: Kết thúc ca nhưng vẫn còn " + stack.size() + " đơn thuốc chưa hoàn tất.");
            return false;
        }

        System.out.println("=> QUY TRÌNH HỢP LỆ!");
        return true;
    }

    void reset(){
        stack.clear();
    }
}
