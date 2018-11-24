public class Sum13 {
    int sum = 0;
    boolean locked = false;

    void add(int a) {
        if (!locked) {
            if (a == 13) {
                locked = true;
            } else {
                sum = sum + a;
            }
        }
    }

    int valueOf() {
        return sum;
    }
}
