package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.controller;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.Model;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.view.UsersView;

public class Controller {
    private Model model;
    private UsersView usersView;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();
        usersView.refresh(model.getModelData());
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }
}


/*
    public UsersView getUsersView() {
        return usersView;
    }
     */