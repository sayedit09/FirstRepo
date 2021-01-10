package testscript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listner.class)
public class ExecuteLeadTest {
	@Test
	
	public void leadTest() throws Exception {

		Keywords key = new Keywords();
		ArrayList data = new ArrayList();
		FileInputStream file = new FileInputStream(
				"D:\\workspace2\\practicing\\src\\test\\resources\\testcases\\practicing.xlsx");
		XSSFWorkbook wbks = new XSSFWorkbook(file);
		XSSFSheet sheet = wbks.getSheet("Testcasess");

		Iterator row = sheet.iterator();
		while (row.hasNext()) {
			Row rowitr = (Row) row.next();

			Iterator cellitr = rowitr.cellIterator();
			while (cellitr.hasNext()) {
				Cell cell1 = (Cell) cellitr.next();

				switch (cell1.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					data.add(cell1.getStringCellValue());
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
				String keyword = (String) data.get(i);
				String testdata = (String) data.get(i + 1);
				String object = (String) data.get(i + 2);

				System.out.println(keyword);
				System.out.println(testdata);
				System.out.println(object);
				key.openbrowser();

			}

			if (data.get(i).equals("navigate")) {
				String keyword = (String) data.get(i);
				String testdata = (String) data.get(i + 1);
				String object = (String) data.get(i + 2);

				System.out.println(keyword);
				System.out.println(testdata);
				System.out.println(object);
				key.navigate(testdata);

			}

			if (data.get(i).equals("verifypagetitle")) {
				String keyword = (String) data.get(i);
				String testdata = (String) data.get(i + 1);
				String object = (String) data.get(i + 2);

				System.out.println(keyword);
				System.out.println(testdata);
				System.out.println(object);
				String actualValue = key.verifypagetitle();
				System.out.println(actualValue);
				org.testng.Assert.assertEquals(actualValue, testdata);

			}

			if (data.get(i).equals("click")) {

				String keyword = (String) data.get(i);
				String testdata = (String) data.get(i + 1);
				String object = (String) data.get(i + 2);

				System.out.println(keyword);
				System.out.println(testdata);
				System.out.println(object);
				key.click(object);
				
			}
			
			if (data.get(i).equals("getWindowHandl")) {

				//String keyword = (String) data.get(i);
				//String testdata = (String) data.get(i + 1);
				//String object = (String) data.get(i + 2);

				//System.out.println(keyword);
				//System.out.println(testdata);
				//System.out.println(object);
				key.getWindowHandle();
			
			}
			
			if (data.get(i).equals("input")) {

				String keyword = (String) data.get(i);
				String testdata = (String) data.get(i + 1).toString();
				String object = (String) data.get(i + 2);

				System.out.println(keyword);
				System.out.println(testdata);
				System.out.println(object);
				key.input(testdata,object);
			}
			
			
			if (data.get(i).equals("selectlist")){
				
				String keyword=(String) data.get(i);
				String testdata=(String) data.get(i+1);
				String object=(String) data.get(i+2);
				System.out.println(keyword);
				System.out.println(testdata);
				System.out.println(object);
				key.selectlist(testdata,object);
		
			}
		}

	}
	@Test
	public void  test1() {
		
		
	}
}
