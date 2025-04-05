package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//s1:create FileInputStram object
		FileInputStream fis=new FileInputStream("./Testdata/selenium.xlsx");
		
		//s2:create respective file type object
		Workbook wb = WorkbookFactory.create(fis);
		
		//s3:call read methods
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	//	String email=wb.getSheet("Sheet1").getRow(0)
		System.out.println(url);
		
		
		
	}

}
