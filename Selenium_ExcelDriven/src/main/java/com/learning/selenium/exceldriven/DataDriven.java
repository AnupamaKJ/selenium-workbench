package com.learning.selenium.exceldriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class DataDriven
{
    //identify the test case columns by scanning the entire 1st row
    //once column is identified , then scan entire testcases column to identify Purchase testcase row
    //after u grab purchase testcase row -- pull the data of that row and feed into test

    public static void main(String[] args) throws IOException
    {
        //file input stream argument
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//Selenium_ExcelDriven//data//demoData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        int sheets = workbook.getNumberOfSheets();
        for (int i=0; i<sheets; i++)
        {
           if(workbook.getSheetName(i).equalsIgnoreCase("testdata") )
           {
               XSSFSheet sheet = workbook.getSheetAt(i);
               //identify the testcases columns by scanning the entire 1st row
               Iterator<Row> rows =  sheet.iterator();
               Row firstrow = rows.next();
               Iterator<Cell> ce = firstrow.cellIterator(); //Collection of cells
               int k=0;
               int column = 0;
               while(ce.hasNext())
               {
                  Cell value = ce.next();
                  if (value.getStringCellValue().equalsIgnoreCase("Data2"))
                  {
                      //desired column
                      column = k;
                  }
                  k++;
               }
                System.out.println(column);
               //once column is identified , then scan entire testcases column to identify Purchase testcase row


           }

        }
    }

}