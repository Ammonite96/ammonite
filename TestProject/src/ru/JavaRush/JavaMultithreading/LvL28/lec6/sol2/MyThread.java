package ru.JavaRush.JavaMultithreading.LvL28.lec6.sol2;

/**
 * В отдельном файле создай класс MyThread унаследовавшись от Thread.
 * MyThread должен:
 * 1. Иметь возможность быть созданным используя любой конструктор супер-класса (Alt+Insert).
 * 2. Приоритет у трэдов должен проставляться циклично от минимального значения до максимального значения.
 * 3. если у трэда установлена трэд-группа(ThreadGroup), то приоритет трэда не может быть больше максимального приоритета его трэд-группы.
 */

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
    }

    private static int priority = Thread.MIN_PRIORITY;

    {
        if (priority > Thread.MAX_PRIORITY)
            priority = Thread.MIN_PRIORITY;
        this.setPriority(priority++);
    }
}
