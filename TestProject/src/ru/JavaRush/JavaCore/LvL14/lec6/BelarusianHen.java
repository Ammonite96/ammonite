package ru.JavaRush.JavaCore.LvL14.lec6;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 50 ;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

// <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">