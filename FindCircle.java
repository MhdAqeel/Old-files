import java.util.Scanner;

public class FindCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double a = Math.PI * r * r;
        double p = 2 * Math.PI * r;

        System.out.println("The Area of the circle: " + a);
        System.out.println("The Perimeter of the circle: " + p);
    }
}
