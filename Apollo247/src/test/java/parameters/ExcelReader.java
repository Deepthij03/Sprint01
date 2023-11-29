package parameters;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	public String[][] getData() throws IOException 
	{
		
		FileInputStream fis= new FileInputStream("C:\\Users\\djampani\\Eclipse-Workspace2\\Apollo247\\src\\test\\resources\\Data\\users.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(0);
		XSSFRow r=s1.getRow(0);
		
		int row=s1.getLastRowNum();
		int col=r.getLastCellNum();
		System.out.println("Row : "+row+"\nCol : "+col);
		
		String data[][]=new String[row+1][col];
		
		for(int ri=0; ri<=row; ri++)
		{
			XSSFRow rowData=s1.getRow(ri);
			for(int ci=0; ci<col; ci++)
			{
				XSSFCell cell = rowData.getCell(ci);
				data[ri][ci]=cell.getStringCellValue();
				
			}
			
		}
		return data;
	}


}
