package apachePoi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class ExcelRead {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/vahit.peker/Desktop/Try.xls");
        System.out.println("1");
        FileInputStream fs = new FileInputStream(file);
        System.out.println("2");
        Workbook wb = new HSSFWorkbook(fs);
        System.out.println("3");
        Sheet sh = wb.getSheet("Sheet1");
        int rowCount = sh.getLastRowNum();
        Row rw;
        Cell cell;
        for (int i = 0; i < rowCount; i++) {
            rw = sh.getRow(i);
            cell = rw.getCell(0);
            System.out.println(cell.getStringCellValue());


        /*System.out.println("4");
        Row rw=sh.getRow(1);
        System.out.println("5");
        Cell cell=rw.getCell(0);
        System.out.println("6");
        System.out.println(cell.getStringCellValue());

         */

        }
    }
}