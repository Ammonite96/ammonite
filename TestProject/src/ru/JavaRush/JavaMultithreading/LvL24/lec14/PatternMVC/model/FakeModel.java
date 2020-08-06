package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.been.User;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.service.UserService;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

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

    @Override
    public void loadDeletedUsers(){
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);
        throw new UnsupportedOperationException();
    }
}
