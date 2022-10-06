package navigation;

import base.baseTest;
import org.junit.jupiter.api.Test;


public class NavigationTest extends baseTest {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
    }
}
