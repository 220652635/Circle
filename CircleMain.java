package za.ac.wsu.driver.s220652635;

import za.ac.wsu.s220652635.Circle;

public class CircleMain {
    public static void main(String[]args){
        Circle C1 = new Circle();
        Circle C2 = new Circle();
        Circle C3 = new Circle();

        C1.setRadius(10);
        C1.setX(3);
        C1.setY(6);

        C2.setRadius(5);
        C2.setX(10);
        C2.setY(15);

        C3.setRadius(7);
        C3.setX(14);
        C3.setY(17);

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