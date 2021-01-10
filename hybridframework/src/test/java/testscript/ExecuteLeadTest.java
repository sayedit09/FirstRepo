package testscript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExecuteLeadTest {

	@Test(description = "This test case will give complete hybrid automation output")
	public void leadTest() throws Exception {
		// System.setProperty("webdriver.gecko.driver", "D:\\chromedriver_win32 (1)");
		
		Keywords key = new Keywords();
		ArrayList data = new ArrayList(); //Collection
		FileInputStream file = new FileInputStream(
				"D:\\workspace2\\hybridframework\\src\\test\\resources\\testcases\\testss.xlsx");

		XSSFWorkbook wbks = new XSSFWorkbook(file);
		XSSFSheet sheet = wbks.getSheet("TestSteps");
		
		Iterator row = sheet.iterator();
        while (row.hasNext()) {
			Row rowitr = (Row) row.next();
			
			Iterator cellitr = rowitr.cellIterator(); // set an iterator
			while (cellitr.hasNext()) {             // check
				Cell cell1 = (Cell) cellitr.next();  // move
				

				switch (cell1.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					data.add(cell1.getStringCellValue()); //add() method from collection
					break;
				case Cell.CELL_TYPE_NUMERIC:
					data.add(cell1.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					data.add(cell1.getBooleanCellValue());
					break;
				}
			}
		}

		for (int i = 0; i < data.size(); i++) {

			if (data.get(i).equals("openbrowser")) {

				String Keyword = (String) data.get(i);
				String testData = (String) data.get(i + 1);
				String objectName = (String) data.get(i + 2);

				System.out.println(Keyword);
				System.out.println(testData);
				System.out.println(objectName);

				key.openbrowser();
			}
			if (data.get(i).equals("navigate")) {

				String Keyword = (String) data.get(i);
				String testData = (String) data.get(i + 1);
				String objectName = (String) data.get(i + 2);

				System.out.println(Keyword);
				System.out.println(testData);
				System.out.println(objectName);

				key.navigate(testData);
			}
			if (data.get(i).equals("input")) {
			
			 String Keyword = (String) data.get(i);
			
			String testData = (String) data.get(i + 1).toString();
			
			 String objectName = (String) data.get(i + 2);
			
			System.out.println(Keyword);
			System.out.println(testData);
			System.out.println(objectName);
			System.out.println("test3");System.out.println("test3");
			 key.input(testData, objectName);
			
			 }
			 if (data.get(i).equals("selectlist")) {
			 String keyword = (String) data.get(i);
			 String testData = (String) data.get(i + 1);
			 String objectName = (String) data.get(i + 2);
			 System.out.println(keyword);
			 System.out.println(testData);
			 System.out.println(objectName);
			 key.selectlist(objectName, testData);
			 }
			
			 if (data.get(i).equals("click")) {
			
			 String Keyword = (String) data.get(i);
			 String testData = (String) data.get(i + 1);
			 String objectName = (String) data.get(i + 2);
			
			 System.out.println(Keyword);
			 System.out.println(testData);
			 System.out.println(objectName);
			
			 key.click(objectName);
			 }
			
			 if (data.get(i).equals("verifypagetitle")) {
			 String keyword = (String) data.get(i);
			 String testData = (String) data.get(i + 1);
			 String objectName = (String) data.get(i + 2);
			 System.out.println(keyword);
			 System.out.println(testData);
			 System.out.println(objectName);
			 String actualValue = key.verifypagetitle();
			 System.out.println(actualValue);
			 org.testng.Assert.assertEquals(testData, actualValue);
			
			 }

		}
	}

}
