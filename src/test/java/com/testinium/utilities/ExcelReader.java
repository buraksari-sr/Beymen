package com.testinium.utilities;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReader {

    private static Workbook workbook;
    private static Sheet sheet;
    private static FileInputStream fileInputStream;
    private static FileOutputStream fileOutputStream;
    private static Row row;
    private static Cell cell;

    public static String getCell(int row,int column )  {
        try {
            fileInputStream = new FileInputStream("Beymen.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = workbook.getSheet("searching_word");
        return sheet.getRow(row).getCell(column).getStringCellValue();
    }

    public static void main(String[] args)  {
        System.out.println("ExcelReader.getCell(0, 1) = " + ExcelReader.getCell(0, 0));
    }


}
