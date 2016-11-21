package cn.hero.util;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import org.junit.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class ExcelOprator {

	public String[][] readExcel(Integer rowNum,Integer columnNum,boolean isWithFirstRow)
	{
		try {
			File excelSource = this.openFileDialog();
            Workbook book = Workbook.getWorkbook(excelSource);
        	Sheet sheet = book.getSheet(0);
        	if(rowNum==null||rowNum==0)
        	{
        		rowNum = sheet.getRows();
        	}
        	if(columnNum==null||columnNum==0)
        	{
        		columnNum = sheet.getColumns();
        	}
        	String[][] results = new String[rowNum][columnNum];
        	for(int i=0;i<rowNum;i++)
        	{
        		for(int j=0;j<columnNum;j++)
        		{
        			Cell cell1 = sheet.getCell(j, i);
                    String result = cell1.getContents();
                    if(result == null||result == "")
                    {
                    	result = "null";
                    }
                    results[i][j] = result;
                    System.out.print(result+"---");
        		}
        		System.out.print("\n");
        	}
            book.close();
            return results;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
	}
	
	public  File openFileDialog()
	{
		JFileChooser jfc=new JFileChooser();
		jfc.addChoosableFileFilter(new FileFilter()
	    {
	          public boolean accept(File file)
	          {
	                return (file.getName().indexOf("xls")!=-1);
	          }
	          public String getDescription()
	          {
	                return "Excel(*.xls)";
	          }
	      });
	     jfc.showOpenDialog(null);
	     File file=jfc.getSelectedFile();
	     return file;
	}
	
	@Test
	public void test()
	{
		this.readExcel(null, null, true);
	}
}
