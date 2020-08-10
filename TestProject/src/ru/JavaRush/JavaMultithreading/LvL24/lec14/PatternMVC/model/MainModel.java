package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.been.User;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.service.UserService;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.service.UserServiceImpl;

import java.util.List;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(getAllUsers());
        modelData.setDisplayDeletedUserList(false);
    }

    @Override
    public void loadDeletedUsers() {
        modelData.setUsers(userService.getAllDeletedUsers());
        modelData.setDisplayDeletedUserList(true);
    }

    @Override
    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }

    public void deleteUserById(long id){
        userService.deleteUser(id);
        loadUsers();
    }

    private List<User> getAllUsers(){
        modelData.setDisplayDeletedUserList(false);
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1,100));
    }

    public void changeUserData(String name, long id, int level){
        userService.createOrUpdateUser(name, id, level);
        loadUsers();
    }
}
