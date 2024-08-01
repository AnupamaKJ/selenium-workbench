package com.learning.selenium.dataDriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excel {

    @Test
    public void getData() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//data//excelDriven.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
        XSSFRow row = sheet.getRow(0);
        int columnCount = row.getLastCellNum();

        Object data[][]=new Object[rowCount-1][columnCount];
        //start from 1 because first row is header
        for (int i = 1; i < rowCount; i++) //Starting with row one
        {
            System.out.println("Outer loop started");
            row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                System.out.println(row.getCell(j));
            }
            System.out.println("Outer loop ended");
        }

    }
}
