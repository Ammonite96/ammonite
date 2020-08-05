package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.been.User;

import java.util.ArrayList;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("A", 1, 1));
        userArrayList.add(new User("B", 2, 1));
        modelData.setUsers(userArrayList);
    }
}
