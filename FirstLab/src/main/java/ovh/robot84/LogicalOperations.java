package ovh.robot84;

/**
 *
 */
public class LogicalOperations {

    /**
     * @param one
     * @param two
     * @return
     */
    static public boolean onlyOneOfTwoIsTrue(boolean one, boolean two) {
        return !(one && two) && (one || two);
    }

    /**
     * @param i
     * @return
     */
    static public boolean isTeen(int i) {
        return (i >= 13) & (i <= 19);
    }
}
