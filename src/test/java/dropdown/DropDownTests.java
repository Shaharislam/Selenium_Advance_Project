package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropDownTests  extends BaseTests {

    @Test
    public void testSelectOption(){
       var dropDownPage =  homePage.clickDropDown();
       String option = "Option 1";
       dropDownPage.selectFromDropDown(option);
       var selectedOptions = dropDownPage.getSelectedOptions();
       assertEquals(selectedOptions.size(),1,"Incorrect number of selected Options");
       assertTrue(selectedOptions.contains(option),"Option is not selected");
    }
}
