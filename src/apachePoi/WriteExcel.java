package apachePoi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook workbook= new HSSFWorkbook();
        HSSFSheet sheet=workbook.createSheet("FirstExcelSheet");
        HSSFRow row=sheet.createRow(0);
        HSSFCell cell=row.createCell(0);
        cell.setCellValue("1.Cell");

        cell=row.createCell(1);
        DataFormat format=workbook.createDataFormat();
        CellStyle dateStyle=workbook.createCellStyle();
        dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
        cell.setCellStyle(dateStyle);
        cell.setCellValue(new Date());
        System.out.println("1");

        row.createCell(2).setCellValue("3. Cell");
        sheet.autoSizeColumn(1);

        workbook.write(new FileOutputStream("Try.xls"));
        workbook.close();

    }
}
