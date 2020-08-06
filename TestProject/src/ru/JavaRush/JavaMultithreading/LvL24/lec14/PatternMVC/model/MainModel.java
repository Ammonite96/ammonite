package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.service.UserService;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.service.UserServiceImpl;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(userService.getUsersBetweenLevels(1,100));
    }

    @Override
    public void loadDeletedUsers() {
        modelData.setUsers(userService.getAllDeletedUsers());
    }
}
