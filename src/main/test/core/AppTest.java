package core;

import static org.testng.Assert.*;

public class AppTest {

    @org.testng.annotations.Test
    public void testReturnOne() throws Exception {
        assert(App.returnOne() == 1);
    }
}