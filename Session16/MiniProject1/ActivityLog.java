package Session16.MiniProject1;

import java.util.*;

public class ActivityLog {
    private Stack<String> stack = new Stack<>();

    public void log(String action) {
        stack.push(action);
    }

    public String undo() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return "No actions to undo.";
    }

    public void showLogs() {
        for (String log : stack) {
            System.out.println(log);
        }
    }
}
