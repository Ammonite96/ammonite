package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.controller.Controller;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.FakeModel;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.MainModel;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.Model;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.view.EditUserView;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126);
        editUserView.fireEventUserChanged("Oleg", 126, 3);
        editUserView.fireEventUserDeleted(124);
        usersView.fireEventShowDeletedUsers();
    }
}
