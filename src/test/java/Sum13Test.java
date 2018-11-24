import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum13Test {


    @Test
    public void test1() {
        Sum13 sum13 = new Sum13();

        assertEquals(0, sum13.valueOf());
    }

    @Test
    public void test2() {
        Sum13 sum13 = new Sum13();
        sum13.add(5);
        assertEquals(5, sum13.valueOf());
    }

    @Test
    public void test3() {
        Sum13 sum13 = new Sum13();
        sum13.add(5);
        sum13.add(10);
        assertEquals(15, sum13.valueOf());
    }

    @Test
    public void test4() {
        Sum13 sum13 = new Sum13();
        sum13.add(5);
        sum13.add(13);
        sum13.add(10);
        assertEquals(5, sum13.valueOf());
    }
}
