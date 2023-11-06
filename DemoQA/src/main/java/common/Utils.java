package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {
	// Read data from Excel
	public String[][] readDataFromExcel(String dataFile, String dataSheet) {
		String[][] dataTable = null;
		String excelFilePath = System.getProperty("user.dir") + "/testdata/" + dataFile;

		try (FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath))) {
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(dataSheet);

			int numRows = sheet.getLastRowNum();
			int numCols = sheet.getRow(1).getLastCellNum();

			dataTable = new String[numRows][numCols];

			for (int rowIndex = 1; rowIndex <= numRows; rowIndex++) {
				Row row = sheet.getRow(rowIndex);
				if (row != null) {
					for (int colIndex = 0; colIndex < numCols; colIndex++) {
						Cell cell = row.getCell(colIndex);
						if (cell != null) {
							switch (cell.getCellType()) {
							case STRING:
								dataTable[rowIndex - 1][colIndex] = cell.getStringCellValue();
								break;
							case NUMERIC:
								if (DateUtil.isCellDateFormatted(cell)) {
									dataTable[rowIndex - 1][colIndex] = cell.getDateCellValue().toString();
								} else {
									double numericValue = cell.getNumericCellValue();
									long longValue = (long) numericValue;
									if (numericValue == longValue) {
										dataTable[rowIndex - 1][colIndex] = String.valueOf(longValue);
									} else {
										dataTable[rowIndex - 1][colIndex] = String.valueOf(numericValue);
									}
								}
								break;
							case BOOLEAN:
								dataTable[rowIndex - 1][colIndex] = String.valueOf(cell.getBooleanCellValue());
								break;
							case BLANK:
								dataTable[rowIndex - 1][colIndex] = "";
								break;
							default:
								dataTable[rowIndex - 1][colIndex] = "";
							}
						}
					}
				}
			}
			for (int i = 0; i < numRows; i++) {
				for (int j = 0; j < numCols; j++) {
					System.out.print(dataTable[i][j] + "\t");
				}
				System.out.println();
			}
		} catch (IOException e) {
			// Handle the exception here, you can print an error message or take appropriate
			// action.
			e.printStackTrace();
		}

		return dataTable;
	}

}
