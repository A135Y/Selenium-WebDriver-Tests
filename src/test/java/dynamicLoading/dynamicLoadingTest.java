package dynamicLoading;

import base.baseTest;
import org.junit.jupiter.api.Test;

public class dynamicLoadingTest extends baseTest {

    @Test
    public void testWait(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
    }

}
