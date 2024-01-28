package com.app.sunbeam.ExcelHelper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	
	public static Sheet ExcelWSheet;
	public static Cell cellKey,cellValue ;
	Workbook ExcelWBook;
	FileInputStream ExcelFile ;
	DataFormatter df = new DataFormatter();
	
	/*
	 * It is used to read values from Excel file 
	 */
	public Object[][] readFromExcel(String filePath, String fileName, String sheetName) throws IOException {
		Object[][] mapValues;
		ExcelWSheet = setExcelFile(filePath, fileName, sheetName);
		try {
			int rowNum = ExcelWSheet.getLastRowNum();
			int colNum = ExcelWSheet.getRow(1).getLastCellNum();

			mapValues = new Object[rowNum][1];

			for (int i = 0; i < rowNum; i++) {
				Map<String, String> dataMap = new HashMap<>();
				for (int j = 0; j < colNum; j++) {
					cellKey = ExcelWSheet.getRow(0).getCell(j);
					String key = cellKey == null ? "" : df.formatCellValue(cellKey);
					cellValue = ExcelWSheet.getRow(i + 1).getCell(j);
					String value = cellValue == null ? "" : cellValue.getRichStringCellValue().toString();
					dataMap.put(key, value);
				}
				mapValues[i][0] = dataMap;
			}

		} catch (Exception e) {
			mapValues = null;
		}
		ExcelWBook.close();
		ExcelFile.close();
		return mapValues;
	}
	
	public Sheet setExcelFile(String filePath, String fileName, String sheetName) {
		try {
			String finalPath = filePath + fileName;
			ExcelFile = new FileInputStream(finalPath);
			if (fileName.contains(".xlsx")) {
				ExcelWBook = new XSSFWorkbook();
			} else {
				ExcelWBook = new HSSFWorkbook();
			}

			ExcelWSheet = ExcelWBook.getSheet(sheetName);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ExcelWSheet;

	}

}
