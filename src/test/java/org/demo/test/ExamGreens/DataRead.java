package org.demo.test.ExamGreens;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataRead {


	static File file;
	static String path = "C:\\Users\\ELCOT\\Selenium-workspace\\ExcelDataRead\\InputData\\Data.xlsx";
	static FileInputStream stream;
	public static Workbook workbook = null;
	public static Sheet sheet = null;
	public static Row row = null;
	public static Cell cell = null;

	public DataRead(String path) throws Throwable {
		stream = new FileInputStream(path);
		workbook = new XSSFWorkbook(stream);
	}

	public String getCellData(String sheetName, String colName, int rowNum) throws Throwable {

		try {
			int col_Num = -1;
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) {
				if (row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					col_Num = i;
			}

			row = sheet.getRow(rowNum - 1);
			cell = row.getCell(col_Num);
			int type = cell.getCellType();

			if (type == 1) {
				colName = cell.getStringCellValue();
			} else if (type == 0) {
				String cellValue = String.valueOf(cell.getNumericCellValue());
				if (DateUtil.isCellDateFormatted(cell)) {
					SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
					Date date = cell.getDateCellValue();
					cellValue = df.format(date);
				}
				return cellValue;
			} else if (type == Cell.CELL_TYPE_BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());
		} catch (Exception e) {
			e.printStackTrace();
			return "row " + rowNum + " or column " + colName + " does not exist  in Excel";
		}
		return colName;
	}

	public int getRowCount(String sheetName) {

		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum() + 1;

		return rowCount;
	}

	
}
