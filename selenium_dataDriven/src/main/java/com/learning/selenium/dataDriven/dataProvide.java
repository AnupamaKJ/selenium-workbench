package com.learning.selenium.dataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvide {

    //multiple sets of data to our tests
    //array
    //5 sets of data as 5 arrays from data provider to your test
    // then your test will run 5 times with 5 separate sets of data (arrays)


    @Test(dataProvider="driveTest")
    public void testCaseData(String greeting, String communication, int id)
    {
        System.out.println(greeting+communication+id);
    }

    @DataProvider(name="driveTest")
    public Object[][] getData()
    {
        Object[][] data = {{"Hello", "text", 1}, {"bye","message", 143 }, {"solo", "cell", 456 }};
        return data;
    }
}