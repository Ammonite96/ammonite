package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.controller.Controller;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.FakeModel;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.MainModel;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.Model;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new FakeModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventShowDeletedUsers();
    }
}
