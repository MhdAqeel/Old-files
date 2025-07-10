import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = Scan.nextInt();
        System.out.println("Enter the x: ");
        int x = Scan.nextInt();
        Scan.close();
        
        int count = 0;
        int result = 1;
        int twoi = 2 * i;
        int res2 = 1;
        int fact = 1;
        int count1 = 1;
        int count2 = 0;
        int count3 = 1;

        while (count3 <= i) {
            
        
             // Calculate (-1)^i
            while (count < count3) {
                result = -1 * result;
                //count = count + 1;
            }

            // Calculate 2^(2*i)
            while () {
                res2 = x * res2;
                //count2 = count2 + 1;
            }

            // Calculate i!
            while (count3 <= i) {
                fact = fact * count1;
                //count1 = count1 + 1;
            }

        int iterm = (result * res2) / fact;
        count3 = count3 + 1;

        System.out.println("(-1)^" + i + " = " + result);
        System.out.println("2^(" + 2 * i + ") = " + res2);
        System.out.println(i + "! = " + fact);
        System.out.println(iterm);

        }

    }
}