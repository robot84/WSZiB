package ovh.robot84;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Excercise3Test {

    @Test
    public void test01() {
        int[] array = {3, 2, 14, 1, 2, 3, 6};
        int[] sequence = {1, 3, 6, 5};
        assertFalse(ArrayUtils.sequenceAppearsInArray(sequence, array));
    }

    @Test
    public void test02() {
        int[] array = {3, 2, 14, 1, 2, 3, 6};
        int[] sequence = {1, 3};
        assertFalse(ArrayUtils.sequenceAppearsInArray(sequence, array));
    }

    @Test
    public void test03() {
        int[] array = {3, 2, 14, 1, 2, 3, 6};
        int[] sequence = {1, 2, 3};
        assertTrue(ArrayUtils.sequenceAppearsInArray(sequence, array));
    }
}
