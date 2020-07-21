package ru.JavaRush.JavaMultithreading.LvL24.lec6.sol1;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}
