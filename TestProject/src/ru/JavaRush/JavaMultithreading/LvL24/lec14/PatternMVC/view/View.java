package ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.view;

import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.controller.Controller;
import ru.JavaRush.JavaMultithreading.LvL24.lec14.PatternMVC.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
