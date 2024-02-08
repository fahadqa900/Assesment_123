package com.metlife.data;

import com.metlife.utils.ExcelUtils;
import org.testng.annotations.DataProvider;

public class data {
    public class validateData {
    }
    @DataProvider
    public static Object[][] validateData(){

        return ExcelUtils.readExcel("Assessment3Data_new.xlsx", "Sheet1");
    }
}
