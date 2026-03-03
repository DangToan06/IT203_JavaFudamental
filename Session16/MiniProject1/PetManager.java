package Session16.MiniProject1;

import java.util.*;

public class PetManager extends Manager<Pet> {

    public Pet findById(String id) {
        for (Pet pet : list) {
            if (pet.getId().equals(id)) {
                return pet;
            }
        }
        return null;
    }

    public boolean removeById(String id) {
        Pet pet = findById(id);
        if (pet != null) {
            list.remove(pet);
            return true;
        }
        return false;
    }
}
