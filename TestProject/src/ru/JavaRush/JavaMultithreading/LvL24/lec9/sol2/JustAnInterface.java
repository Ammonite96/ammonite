package ru.JavaRush.JavaMultithreading.LvL24.lec9.sol2;

public interface JustAnInterface {
    public static final B B = new B();

    class B extends C {
        public B() {
            System.out.print("B");
        }
    }
}
