package ru.JavaRush.JavaMultithreading.LvL23.lec4.sol3Inner3;

import java.util.List;
import java.util.Map;

/**
 * Внутри класса Solution:
 * 1) реализуйте private class TaskDataProvider используя Task и MockDB, цель которого - обновить поле tasks.
 * 2) реализуйте private class NameDataProvider используя String и MockDB, цель которого - обновить поле names.
 */

public class Solution {
    private List<Task> tasks;
    private List<String> names;

    private DbDataProvider taskDataProvider = new TaskDataProvider();
    private DbDataProvider nameDataProvider = new NameDataProvider();

    public void refresh() {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T> {
        void refreshAllData(Map criteria);
    }

    class Task {
    }

    private class TaskDataProvider implements DbDataProvider<Task> {
        @Override
        public void refreshAllData(Map criteria) {
            tasks = MockDB.getFakeTasks(criteria);
        }
    }

    private class NameDataProvider implements DbDataProvider<String> {
        @Override
        public void refreshAllData(Map criteria) {
            names = MockDB.getFakeNames(criteria);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().tasks.toString());
    }
}
