package test;

import bridgelabz.baseclass.WebTableBaseClass;
import bridgelabz.pages.WebTableElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableTestClass extends WebTableBaseClass {

    WebTableElement element;

    @BeforeMethod
    public void initialization() {
       setUp();
       element = new WebTableElement(driver);
    }

    @Test
    public void automateWebTable()  {
        element.handleWebTable();
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
