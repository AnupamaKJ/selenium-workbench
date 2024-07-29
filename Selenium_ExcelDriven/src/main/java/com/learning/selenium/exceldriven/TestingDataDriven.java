package com.learning.selenium.exceldriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class TestingDataDriven
{
    //identify the test case columns by scanning the entire 1st row
    //once column is identified , then scan entire "Name" column to identify "Annappa" name row
    //after u grab Annappa Name row -- pull the data of that row and feed into test
    public ArrayList<String> getData(String testcaseName) throws IOException
    {
            ArrayList<String> a = new ArrayList<String>();
            //file input stream argument
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//Selenium_ExcelDriven//data//testing.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            int sheets =  workbook.getNumberOfSheets();
            for (int i=0; i<sheets; i++)
            {
                if (workbook.getSheetName(i).equalsIgnoreCase("family"))
                {
                    XSSFSheet sheet = workbook.getSheetAt(i);
                    // identify the Name columns by scanning the entire 1st row

                    Iterator<Row> rows =  sheet.iterator(); //sheets collection of rows
                    Row firstrow = rows.next();
                    Iterator<Cell> ce = firstrow.cellIterator(); //row collection of cells
                    int k = 0;
                    int column = 0;
                    while(ce.hasNext())
                    {
                        Cell value = ce.next();
                        if (value.getStringCellValue().equalsIgnoreCase("family"))
                        {
                            //desired column
                            column = k;
                        }
                        k++;
                    }
                    System.out.println(column);
                    //once column is identified , then scan entire "Name" column to identify "Annappa" name row

                    while (rows.hasNext())
                    {
                        Row r = rows.next();
                        if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName))
                        {
                            //after u grab Annappa Name row -- pull the data of that row and feed into test
                            Iterator <Cell> cv = r.cellIterator();
                            while (cv.hasNext())
                            {
                                Cell c =  cv.next();
                                if (c.getCellType() == CellType.STRING) {
                                    a.add(c.getStringCellValue());  //add to arraylist
                                }
                                else
                                {
                                    a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
                                }
                            }
                        }
                    }
                }
            }
        return a;
    }

}
