import java.util.Scanner;

public class CityRectangleArea {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the radius of the circular wall (R): ");
            double radius = scanner.nextDouble();

            double diameter = 2 * radius;
            double sideLength = (Math.sqrt(2) / 2) * diameter;
            double area = sideLength * sideLength;

            System.out.println("The area of the biggest rectangle inside the circular wall is: " + area);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
