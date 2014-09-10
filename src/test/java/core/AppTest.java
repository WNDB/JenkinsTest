package core;

import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testReturnOne() throws Exception {
        assert(App.returnOne() == 1);
        System.out.println("dziala");
    }
}