package ru.JavaRush.JavaMultithreading.LvL24.lec9.sol2;

public class C implements JustAnInterface {
    public C() {
        System.out.print("C");
        B localB = B;
    }
}
