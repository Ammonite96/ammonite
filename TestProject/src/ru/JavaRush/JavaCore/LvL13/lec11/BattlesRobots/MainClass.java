package ru.JavaRush.JavaCore.LvL13.lec11.BattlesRobots;

/**
 * 1. Разобраться в том, что тут написано.
 * 2. Смириться со своей участью и продолжить разбираться в коде.
 * 3. ...
 * 4. Порадоваться, что мы все поняли.
 * 5. Изменить код согласно новой архитектуре и добавить новую логику:
 * 5.1. Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
 * 5.2. Отредактировать класс Robot учитывая AbstractRobot.
 * 5.3. Расширить класс BodyPart новой частью тела BodyPart.CHEST("грудь").
 * 5.4. Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).
 */

public class MainClass {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}
