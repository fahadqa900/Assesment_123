package com.metlife.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    public static Object[][] readExcel(String workbook, String worksheet) {
        XSSFWorkbook wb;
        try {
            wb = new XSSFWorkbook(new FileInputStream("src/test/resources/" + workbook));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XSSFSheet sh = wb.getSheet(worksheet);
        int row = sh.getPhysicalNumberOfRows() - 1;
        int col = sh.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[row][col];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j < col; j++) {
//                System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
                data[i - 1][j] = sh.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return data;
    }

    //setCellValue("Pass")
//    FileOutputStream fout = new FileOutputStream();
//    wb.write(fout);
}
