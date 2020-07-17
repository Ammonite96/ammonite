package ru.JavaRush.JavaMultithreading.LvL23.lec13.ArcanoidGame;

public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract void draw(Canvas canvas);
    public abstract void move();

    public boolean isIntersec(BaseObject o){
        double distance = Math.sqrt(Math.pow((this.x - o.x), 2) + Math.pow((this.y - o.y), 2));
            if (distance <= Math.max(this.radius,o.radius)){
                return true;
        }
        return false;
    }

    /*
     * Проверяем - не выходит ли (x,y) за границы.
     */
    void checkBorders(double minx, double maxx, double miny, double maxy) {
        if (x < minx) x = minx;
        if (x > maxx) x = maxx;
        if (y < miny) y = miny;
        if (y > maxy) y = maxy;
    }
}
