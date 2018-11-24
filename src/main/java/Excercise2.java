public class Excercise2 {
    /*
    Exercise 2:
Given 3 int values, a b c, print to console their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.
Example:
int a = 1;
int b = 13;
int c = 2;

should print 1
     */
    public static void main(String[] args) {

        Excercise2 ex = new Excercise2();
        ex.run();
    }


    private void run() {

        int a = 1;
        int b = 13;
        int c = 2;

        Sum13 sum13 = new Sum13();
        sum13.add(a);
        sum13.add(b);
        sum13.add(c);
        System.out.println(sum13.valueOf());
    }


}
