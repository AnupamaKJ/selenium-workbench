package com.learning.selenium.dataDriven;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class dataProvide {

    //multiple sets of data to our tests
    //array
    //5 sets of data as 5 arrays from data provider to your test
    // then your test will run 5 times with 5 separate sets of data (arrays)

    DataFormatter formatter = new DataFormatter();

    @Test(dataProvider="driveTest")
    public void testCaseData(String greeting, String communication, String id)
    {
        System.out.println(greeting+communication+id);
    }

    @DataProvider(name="driveTest")
    public Object[][] getData() throws IOException {
       // Object[][] data = {{"Hello", "text", "1"}, {"bye","message", "143" }, {"solo", "cell", "456" }};
        //return data;

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//data//excelDriven.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int columnCount = row.getLastCellNum();

        Object data[][]=new Object[rowCount-1][columnCount];
        //start from 1 because first row is header
        for (int i = 0; i < rowCount-1; i++) //Starting with row one
        {
            row = sheet.getRow(i+1);
            for (int j = 0; j < columnCount; j++) {
                //data[i-1][j] = row.getCell(j).getStringCellValue();
                XSSFCell cell = row.getCell(j);
                data[i][j] = formatter.formatCellValue(row.getCell(j));
            }
        }
        return data;

    }
}
