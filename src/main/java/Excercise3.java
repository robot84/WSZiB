public class Excercise3 {
    /*
    Exercise 3:
Given an array of ints, print to console true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
Example:
int[] array = {3,2,14,1,2,3,6};

should print true
     */


    public static void main(String[] args) {

        Excercise3 ex = new Excercise3();
        ex.run();
    }

    private void run() {
        int[] array = {3, 2, 14, 1, 2, 3, 6};
        int[] sequence = {1, 2, 3};
        if (ArrayUtils.sequenceAppearsInArray(sequence, array)) System.out.println("true");
    }
}
