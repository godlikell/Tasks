package Liga.Zadacha4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double a = userInput("Enter а:");
        double b = userInput("Enter b:");
        double c = userInput("Enter c:");

        if ((a + b > c) && (a + c > b) && (b + c > a))
        {
            System.out.println("triangle exists");
            if (Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2))
            {
                System.out.println(b*c/2);
            }
            else if (Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2))
            {
                System.out.println(a*c/2);
            }
            else if (Math.pow(c,2) == Math.pow(b,2) + Math.pow(a,2))
            {
                System.out.println(b*a/2);
            }
        }
        else
            System.out.println("no such triangle exists");

    }

    private static double userInput(String message) {
        Scanner sc = new Scanner(System.in);
        double i;
        while (true) {
            System.out.print(message);
            try {
                i = Double.parseDouble(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong values!");
            }
        }
        return i;
    }

}

