package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DataTable_HomePage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.WaitUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDefs {

    ExcelUtils excelUtils;
    List<Map<String,String>> dataList;
    DataTable_HomePage dataTable_homePage;


    @Given("user enters {string} from {string} excel sheet and verify the user is created")
    public void user_enters_from_excel_sheet_and_verify_the_user_is_created(String sheetName, String fileName) {

        // String pathOfFile = "./src/test/resources/data_sheet.xlsx";  //This is NOT DYNAMIC
        String pathOfFile = "./src/test/resources/" + fileName;  //This is DYNAMIC
        excelUtils = new ExcelUtils(pathOfFile, sheetName);
        dataList = excelUtils.getDataList();
        System.out.println("dataList = " + dataList);

        //TEST STARTS NOW
        // In order to get data one by one from dataList,
        // we need to pass it through the loop and change it's data type from
        // list to map, so we can manipulate it as key:value pair

        dataTable_homePage = new DataTable_HomePage();

        for (Map<String,String > eachData: dataList ){
            System.out.println("eachData = " + eachData);
            BrowserUtils.clickWithTimeOut(dataTable_homePage.newButton,1);
            BrowserUtils.sendKeysWithTimeout(dataTable_homePage.firstName, eachData.get("first_name"),1);
            BrowserUtils.sendKeysWithTimeout(dataTable_homePage.lastName, eachData.get("last_name"),1);
            BrowserUtils.sendKeysWithTimeout(dataTable_homePage.position, eachData.get("position"),1);
            BrowserUtils.sendKeysWithTimeout(dataTable_homePage.office, eachData.get("office"),1);
            BrowserUtils.sendKeysWithTimeout(dataTable_homePage.extension, eachData.get("extension"),1);
            BrowserUtils.sendKeysWithTimeout(dataTable_homePage.startDate, eachData.get("startDate"),1);
            BrowserUtils.sendKeysWithTimeout(dataTable_homePage.salary, eachData.get("salary"),1);

            BrowserUtils.clickWithTimeOut(dataTable_homePage.createButton, 2);
            BrowserUtils.sendKeysWithTimeout(dataTable_homePage.searchBox, eachData.get("first_name"),2);
            Assert.assertTrue(dataTable_homePage.verifyNameField.getText().contains(eachData.get("first_name")));
            WaitUtils.waitFor(2);

            Driver.getDriver().navigate().refresh();
        }
    }
}















