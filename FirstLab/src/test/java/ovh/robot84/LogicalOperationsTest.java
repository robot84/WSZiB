package ovh.robot84;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LogicalOperationsTest {


    @Test
    public void test1() {

        boolean c = true;
        int a = 3, b = 7;
        assertFalse(LogicalOperations.isTeen(a));
    }

    @Test
    public void test02() {

        boolean c = true;
        int a = 23, b = 7;
        assertFalse(LogicalOperations.isTeen(a));
    }

    @Test
    public void test03() {

        boolean c = true;
        int a = -23452353, b = 7;
        assertFalse(LogicalOperations.isTeen(a));
    }

    @Test
    public void test04() {

        boolean c = true;
        int a = 20;
        assertFalse(LogicalOperations.isTeen(a));
    }

    @Test
    public void test05() {

        boolean c = true;
        int a = 12;
        assertFalse(LogicalOperations.isTeen(a));
    }

    @Test
    public void test06() {

        boolean c = true;
        int a = 13;
        assertTrue(LogicalOperations.isTeen(a));
    }

    @Test
    public void test07() {

        boolean c = true;
        int a = 15;
        assertTrue(LogicalOperations.isTeen(a));
    }

    @Test
    public void test08() {

        boolean c = true;
        int a = 19;
        assertTrue(LogicalOperations.isTeen(a));
    }

    @Test
    public void test09() {

        boolean a = false;
        boolean b = false;

        assertFalse(LogicalOperations.onlyOneOfTwoIsTrue(a, b));
    }

    @Test
    public void test10() {

        boolean a = false;
        boolean b = true;

        assertTrue(LogicalOperations.onlyOneOfTwoIsTrue(a, b));
    }

    @Test
    public void test11() {

        boolean a = true;
        boolean b = false;

        assertTrue(LogicalOperations.onlyOneOfTwoIsTrue(a, b));
    }

    @Test
    public void test12() {

        boolean a = true;
        boolean b = true;

        assertFalse(LogicalOperations.onlyOneOfTwoIsTrue(a, b));
    }
}
