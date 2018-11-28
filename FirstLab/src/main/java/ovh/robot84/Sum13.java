package ovh.robot84;

/**
 *
 */
public class Sum13 {
    int sum = 0;
    boolean locked = false;

    /**
     * @param a
     */
    void add(int a) {
        if (!locked) {
            if (a == 13) {
                locked = true;
            } else {
                sum = sum + a;
            }
        }
    }

    /**
     * @return
     */
    int valueOf() {
        return sum;
    }
}
