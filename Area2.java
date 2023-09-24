package lab_sheet_01;

import java.util.Scanner;

class Area2 {
    double length;
    double breadth;


    public double getLength() {
        return length;
    }


    public void setLength(double length) {
        this.length = length;
    }


    public double getBreadth() {
        return breadth;
    }


    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }


    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = userInput.nextInt();

        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = userInput.nextInt();

        Area2 obj = new Area2();
        obj.setLength(length);
        obj.setBreadth(breadth);

        double areaOfRectangle = obj.getArea();

        System.out.println("The area of the rectangle is " + areaOfRectangle);
        userInput.close();

}
}
