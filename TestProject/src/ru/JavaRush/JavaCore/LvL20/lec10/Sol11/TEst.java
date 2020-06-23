package ru.JavaRush.JavaCore.LvL20.lec10.Sol11;

public class TEst {
    public static int getRectangleCount(byte[][] a) {

        byte[][] b = a;
        int count = 0;

        for (int i = 0; i < b.length ; i++) {

            for (int j = 0; j < b[i].length ; j++) {
                if (b[i][j]==1){
                    count++;
                    int gor = 1;
                    while (j+gor < b[i].length && b[i][j+gor]==1){
                        b[i][j+gor]=0;
                        gor++;
                    }
                    int vert = 1;
                    while (i+vert < b.length && b[i+vert][j]==1){
                        b[i+vert][j]=0;
                        int gortime = 1;
                        while (gortime!=gor){
                            b[i+vert][j+gortime]=0;
                            gortime++;
                        }
                        vert++;
                    }
                }
            }

        }
        return count;
    }
}
