package ru.JavaRush.JavaMultithreading.LvL23.lec8.sol3;

import ru.JavaRush.JavaMultithreading.LvL23.lec8.sol3.vo.*;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        print(solution.getUsers());
        print(solution.getLocations());
    }

    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }

    public List<User> getUsers() {
        return new AbstractDbSelectExecutor<User>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + new User().getClass().getSimpleName().toUpperCase();
            }
        }.execute();
    }

    public List<Location> getLocations() {
        return new AbstractDbSelectExecutor<Location>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + new Location().getClass().getSimpleName().toUpperCase();
            }
        }.execute();
    }

    public List<Server> getServers(){
        return new AbstractDbSelectExecutor<Server>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + new Server().getClass().getSimpleName().toUpperCase();
            }
        }.execute();
    }

    public List<Subject> getSubjects(){
        return new AbstractDbSelectExecutor<Subject>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + new Subject().getClass().getSimpleName().toUpperCase();
            }
        }.execute();
    }

    public List<Subscription> getSubscriptions(){
        return new AbstractDbSelectExecutor<Subscription>() {
            @Override
            public String getQuery() {
                return "SELECT * FROM " + new Subscription().getClass().getSimpleName().toUpperCase();
            }
        }.execute();
    }
}
