package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.been.User;

import java.util.List;

public class ModelData {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
