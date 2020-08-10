package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.view;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.controller.Controller;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.ModelData;

public class EditUserView implements View {
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser());
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventUserDeleted(long id){
        controller.onUserDelete(id);
    }

    public void fireEventUserChanged(String name, long id, int level){
        controller.onUserChange(name, id, level);
    }

}


/*

2. Аналогично UsersView создай EditUserView.
Логика метода refresh:
2.1. Вывести в консоль "User to be edited:".
2.2. С новой строки вывести табуляцию и активного пользователя.
2.3. С новой строки вывести разделитель "===================================================".

 */