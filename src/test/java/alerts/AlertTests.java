package alerts;

import base.baseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertTests extends baseTest {

    @Test
    public void testClickAlertButton(){
       var alertsPage =  homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.clickAlertButton();
        assertEquals(alertsPage.getResults(),"You successfully clicked an alert");
    }
}
