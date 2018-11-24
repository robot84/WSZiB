import java.util.Scanner;

public class Excercise1 {


    public static void main(String[] args) {
        Excercise1 ex1 = new Excercise1();
        ex1.run();
    }


    private void run() {

        System.out.println("Please write first integer number:");
        Scanner scanner = new Scanner(System.in);
        int myInt1 = scanner.nextInt();
        System.out.println("Please write second integer number:");
        int myInt2 = scanner.nextInt();

        if (LogicalOperations.onlyOneOfTwoIsTrue(LogicalOperations.isTeen(myInt1),
                LogicalOperations.isTeen(myInt2)))
            System.out.println("teen");
    }
}
