package ovh.robot84;

import java.util.Scanner;

public class Excercise1 {
    /*
        Exercise 1:
        We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, print to console true if one or the other is teen, but not both.
        Example:
        int a = 1;
        int b = 13;

    if a or b is "teen" print "teen"
        */
    public static void main(String[] args) {

        Excercise1 ex1 = new Excercise1();
        ex1.run();
    }


    private void run() {
        int a = 1;
        int b = 13;
        System.out.println("Please write first integer number:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Please write second integer number:");
        b = scanner.nextInt();

        if (LogicalOperations.onlyOneOfTwoIsTrue(LogicalOperations.isTeen(a),
                LogicalOperations.isTeen(b)))
            System.out.println("teen");
    }
}
