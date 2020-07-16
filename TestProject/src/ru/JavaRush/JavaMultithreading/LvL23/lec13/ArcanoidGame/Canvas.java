package ru.JavaRush.JavaMultithreading.LvL23.lec13.ArcanoidGame;

public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height+2][width+2];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public void setPoint(double x, double y, char c){
        int xInt = (int) Math.round(x);
        int yInt = (int) Math.round(y);
        matrix[yInt][xInt] = c;
        if (x < 0 || y < 0 || y>=matrix.length||x>=matrix[0].length)
            return;

    }
    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] != 0)
                    setPoint(x+j, y+i, c);
            }
        }
    }

    public void clear(){
        matrix = new char[getHeight()+2][getWidth()+2];
    }

    public void print(){
        for (int i = 0; i < matrix.length; i++)
            System.out.println(matrix[i]);
    }
}
