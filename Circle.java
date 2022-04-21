package za.ac.wsu.s220652635;

public class Circle {

    private double radius;
    private int x;
    private int y;

    public double calculateArea () {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference () {
        return 2 * Math.PI * radius;
    }
    public double calculateDiameter () {
        return 2 * radius;
    }
    public void setRadius ( double radius ){
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    public void setX ( int x){
        this.x = x;
    }

    public void setY ( int y){
        this.y = y;
    }

    public double getRadius () {
        return radius;
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

}
