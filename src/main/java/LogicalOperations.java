public class LogicalOperations {

    static public boolean onlyOneOfTwoIsTrue(boolean one, boolean two) {
        return !(one && two) && (one || two);
    }

    static public boolean isTeen(int i) {
        return (i >= 13) & (i <= 19);
    }
}
