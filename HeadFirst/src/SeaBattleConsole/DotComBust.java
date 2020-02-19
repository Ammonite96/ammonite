package SeaBattleConsole;

import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();  //Обьявляем и инициализируем переменные, которые нам понадобятся
    private int numOfGuesses = 0;

    private void setUpGame() {
        // Создадим несколько сайтов и присвоим им адреса.
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom tree = new DotCom();
        one.setName("Pets.com");
        two.setName("eToys.com");
        tree.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(tree);

        System.out.println("Ваша цель потопить три сайта.");
        System.out.println("Pets.com, eToys.com, Go2.com");     // Выводим краткие инструкции для пользователя
        System.out.println("Попытайтесь потопить их за минимальное кол.во ходов.");

        for (DotCom dotComToSet : dotComList) {                 // Повторяем с каждым объектом "DotCom" в списке
            ArrayList<String> newLocation = helper.placeDotCom(3); // Запрашиваем у вспомогательного обьекта адрес сайта.
            dotComToSet.setLocationCells(newLocation);          // Вызываем сеттер из объекта DOtCom чтобы передать ему местоположение которое только что получили от вспомогательбного обьекта.
        }
    }

    private void startPlaying() {
        while (!dotComList.isEmpty()) {                         // До тех пор пока список обьектов DotCom не станет пустым.
            String userGuess = helper.getUserInput("Сделайте ход"); // Получаем пользовательский ввод
            checkUserGuess (userGuess);                         // Вызываем метод checkUserGuess (userGuess)
        }
        finishGame();                                           // Вызываем метод finishGame()
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;                                         // Инкрементируем кол.во попыток, которые сделал пользоваетль.
        String result = "Мимо";                                 // Подразумеваем промах, пока не выяснили обратного.

        for (DotCom dotComToTest : dotComList) {                // Повторяем с каждым объектом "DotCom" в списке
            result = dotComToTest.checkYourself(userGuess);     // Просим DotCom проверить ход пользователя, ищем поподание или потопления.

            if (result.equals("Попал"))
                break;                                          // Выходим из цикла раньше времени, нет смысла проверять другие сайты.
            if (result.equals("Потопил")){
                dotComList.remove(dotComToTest);                // Ему пришел конец. так что удаляем его из списка сайтов и выходим из цикла.
                break;
            }
        }
        System.out.println(result);                             // Выводим для пользоваетля результат.
    }

    private void finishGame() {
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ни чего не стоят!");
        if (numOfGuesses <= 18){
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток.");
            System.out.println("Вы успели выбраться до того, как вашивложения утонули.");              // Выводим сообщение о том как пользователь прошел игру.
        }else{
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();                     // Создаем игровой обьект.
        game.setUpGame();                                       // Говорим игровому обьекту подготовить игру.
        game.startPlaying();                                    // Говорим игровому обьекту начать главный игровой цикл
                                                                // (продолжаем запрашивать пользовательский ввод и проверять полученные данные).
    }
}
