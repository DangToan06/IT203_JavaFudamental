package Session16.MiniProject1;

import java.util.*;

public class Manager<T> {
    protected List<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public List<T> getAll() {
        return list;
    }
}
