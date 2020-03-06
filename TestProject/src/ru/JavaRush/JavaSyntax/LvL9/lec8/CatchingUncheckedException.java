package ru.JavaRush.LvL9.lec8;

/**
 * В методе handleExceptions обработайте все unchecked исключения.
 * Нужно вывести стек-трейс возникшего исключения используя метод printStack.
 * Можно использовать только один блок try..catch
 */

public class CatchingUncheckedException {
    public static void main(String[] args) {
        handleExceptions(new CatchingUncheckedException());
    }

    public static void handleExceptions(CatchingUncheckedException obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IndexOutOfBoundsException in){
            printStack(in);
        } catch (NumberFormatException num){
            printStack(num);
        } catch (NullPointerException nul){
            printStack(nul);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
