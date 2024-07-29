package com.learning.selenium.exceldriven;

import java.io.IOException;
import java.util.ArrayList;

public class TestSampleTry {

    public static void main(String[] args) throws IOException {

        TestingDataDriven d = new TestingDataDriven();
        ArrayList<String> data =d.getData("Annappa");
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
    }
}
