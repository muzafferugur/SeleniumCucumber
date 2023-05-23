package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class hmcPage {
    hmcPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
