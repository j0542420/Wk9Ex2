import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
        //declarations

        //input
        double length = 0;
        double width = 0;

        //output
        double area = 0;
        double perimeter = 0;

        //user input the length of the rectangle
        System.out.println("Enter the length of the rectangle: ");
        //collect the user input for the length
        length = myObj.nextDouble();

        //user input the width of the rectangle
        System.out.println("Enter the width of the rectangle: ");
        //collect the user input for the width
        width = myObj.nextDouble();

        //calculate the area and perimeter of the rectangle
        area = length * width;
        perimeter = 2 * (length + width);

        //outputs the results for the area and perimeter
        System.out.println("Area of the rectangle: " + area );
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
  }
}