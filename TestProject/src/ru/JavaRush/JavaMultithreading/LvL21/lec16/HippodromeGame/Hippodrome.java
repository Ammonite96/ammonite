package ru.JavaRush.JavaMultithreading.LvL21.lec16.HippodromeGame;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }

    void print() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
        }

        for (int j = 0; j < 2; j++) {
            System.out.println();
        }


    }

    void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            /*
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

             */
        }
    }

    public Horse getWinner (){
        double maxDistance = 0;
        Horse horseWinner = null;
        for (int i = 0; i < horses.size(); i++){
            double distanceTraveled = horses.get(i).getDistance();
            if (distanceTraveled > maxDistance) {
                maxDistance = distanceTraveled;
                horseWinner = horses.get(i);
            }
        }
        return horseWinner;
    }

    public void printWinner (){
        System.out.println("Winner is" + " " + getWinner().getName()+"!");
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        Horse nokiaHorse = new Horse("Nokia", 3.0, 0.0);
        Horse appleHorse = new Horse("Apple", 3.0, 0.0);
        Horse samsungHorse = new Horse("Samsung", 3.0, 0.0);

        game.horses.add(nokiaHorse);
        game.horses.add(appleHorse);
        game.horses.add(samsungHorse);

        game.run();
        game.printWinner();
    }
}
