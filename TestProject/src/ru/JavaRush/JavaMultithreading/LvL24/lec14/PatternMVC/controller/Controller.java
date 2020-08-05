package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.controller;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.Model;

public class Controller {
    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers(){
        model.loadUsers();
    }
}
