package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.view;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.controller.Controller;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.ModelData;

public class UsersView implements View {
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        if (!modelData.isDisplayDeletedUserList()) {
            System.out.println("All users:");
        } else System.out.println("All deleted users:");
        modelData.getUsers().forEach(user -> System.out.println("\t" + user));
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }

}
