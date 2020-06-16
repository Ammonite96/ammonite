package ru.JavaRush.JavaCore.LvL20.lec10.Sol6;

import java.io.*;

public class Solution implements Serializable {
    public static class SubSolution extends Solution{
        private void writeObject (ObjectOutputStream out) throws IOException{
            throw new NotSerializableException();
        }

        private void readObject (ObjectInputStream in) throws IOException{
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}
