package core;

import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testReturnOne() throws Exception {
        assert(App.returnOne() == 1);
        System.out.println("dziala");
    }

    @Test
    public void testReturnTwo() throws Exception {
        assert(App.returnTwo() == 2);
        System.out.println("dziala");
    }
}