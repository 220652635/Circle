package za.ac.wsu.driver.s220652635;

import za.ac.wsu.s220652635.Circle;

public class CircleMain {
    public static void main(String[]args){
        Circle C1 = new Circle();
        Circle C2 = new Circle();
        Circle C3 = new Circle();

        C1.setRadius(3);
        C1.setX(2);
        C1.setY(1);

        C2.setRadius(4);
        C2.setX(2);
        C2.setY(3);

        C3.setRadius(3);
        C3.setX(1);
        C3.setY(2);

        System.out.println("Circle 1 information");
        displayInformation(C1);
        System.out.println("\nCircle 2 Information");
        displayInformation(C2);
        System.out.println("\nCircle 3 information");
        displayInformation(C3);
    }
    public static void displayInformation(Circle c){
        System.out.print("Radius: "+c.getRadius()+", Center:("+c.getX()+","+c.getY()+")");
        System.out.printf("Area:%.2f",c.calculateArea());
        System.out.printf("\nCircumference:%.2f",c.calculateCircumference());
        System.out.printf("\nDiameter:%.2f",c.calculateDiameter());
        System.out.println();
    }

}