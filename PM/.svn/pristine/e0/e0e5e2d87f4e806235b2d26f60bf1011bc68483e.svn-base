package cn.hero.util;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
public class ExcelOperate2 {
	public  static File openFileDialog()
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

	/**

     * 读取Excel的内容，第一维数组存储的是一行中格列的值，二维数组存储的是多少个行

     * @param file 读取数据的源Excel
	 * @param ignoreRowNum 

     * @param ignoreRows 读取数据忽略的行数，比喻行头不需要读入 忽略的行数为1

     * @return 读出的Excel中数据的内容

     * @throws FileNotFoundException

     * @throws IOException

     */

	public static String[][] getData(File file, int sheetNum, int ignoreRowNum) throws FileNotFoundException, IOException {
       List<String[]> result = new ArrayList<String[]>();
       int rowSize = 0;
       BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
       // 打开HSSFWorkbook
       POIFSFileSystem fs = new POIFSFileSystem(in);
       HSSFWorkbook wb = new HSSFWorkbook(fs);
       HSSFCell cell = null;
           HSSFSheet st = wb.getSheetAt(sheetNum);
           // 第一行为标题，不取
           for (int rowIndex = ignoreRowNum; rowIndex <= st.getLastRowNum(); rowIndex++) {
              HSSFRow row = st.getRow(rowIndex);
              if (row == null) {
                  continue;
              }
              int tempRowSize = row.getLastCellNum() + 1;
              if (tempRowSize > rowSize) {
                  rowSize = tempRowSize;
              }
              String[] values = new String[rowSize];
              Arrays.fill(values, "");
              boolean hasValue = false;
              for (short columnIndex = 0; columnIndex <= row.getLastCellNum(); columnIndex++) {
                  String value = "";
                  cell = row.getCell(columnIndex);
                  if (cell != null) {
                     // 注意：一定要设成这个，否则可能会出现乱码
//                     cell.setEncoding(HSSFCell.ENCODING_UTF_16);
                     switch (cell.getCellType()) {
                     case HSSFCell.CELL_TYPE_STRING:
                         value = cell.getStringCellValue();
                         break;
                     case HSSFCell.CELL_TYPE_NUMERIC:
                         if (HSSFDateUtil.isCellDateFormatted(cell)) {
                            Date date = cell.getDateCellValue();
                            if (date != null) {
                                value = new SimpleDateFormat("yyyy-MM-dd")
                                       .format(date);
                            } else {
                                value = "";
                            }
                         } else {
                            value = new DecimalFormat("0").format(cell
                                   .getNumericCellValue());
                         }
                         break;
                     case HSSFCell.CELL_TYPE_FORMULA:
                         // 导入时如果为公式生成的数据则无值
                         if (!cell.getStringCellValue().equals("")) {
                            value = cell.getStringCellValue();
                         } else {
                            value = cell.getNumericCellValue() + "";
                         }
                         break;
                     case HSSFCell.CELL_TYPE_BLANK:
                         break;
                     case HSSFCell.CELL_TYPE_ERROR:
                         value = "";
                         break;
                     case HSSFCell.CELL_TYPE_BOOLEAN:
                         value = (cell.getBooleanCellValue() == true ? "Y" : "N");
                         break;
                     default:
                         value = "";
                     }
                  }
                  values[columnIndex] = value.trim();
                  hasValue = true;
              }
              if (hasValue) {
                  result.add(values);
              }
       }
       in.close();
       String[][] returnArray = new String[result.size()][rowSize];
       for (int i = 0; i < returnArray.length; i++) {
           returnArray[i] = (String[]) result.get(i);
       }
       return returnArray;
    }
    /**

     * 去掉字符串右边的空格

     * @param str 要处理的字符串

     * @return 处理后的字符串

     */

	public static String[][] readXlsx(File file, int sheetNum,int ignoreRowNum) throws IOException{
		List<String[]> result = new ArrayList<String[]>();
		InputStream stream = new FileInputStream(file.getPath());
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(stream);
		// 循环工作表Sheet
		sheetNum=0;
		XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(sheetNum);
		if(xssfSheet == null){
			return null;
		}
		// 循环行Row 
		int maxColumnSize = 0;
		for(int rowNum = ignoreRowNum-1; rowNum <= xssfSheet.getLastRowNum(); rowNum++ ){
			XSSFRow xssfRow = xssfSheet.getRow(rowNum);
			if(xssfRow == null){
				continue;
			}
			if(xssfRow.getLastCellNum()>maxColumnSize)
			{
				maxColumnSize = xssfRow.getLastCellNum();
			}
			String[] values = new String[maxColumnSize];
			// 循环列Cell   
			for(int cellNum = 0; cellNum <= xssfRow.getLastCellNum(); cellNum++){

				XSSFCell xssfCell = xssfRow.getCell( cellNum);

				if(xssfCell == null){
					continue;
				}
				System.out.print("   "+getValue(xssfCell));
				values[cellNum] = getValue(xssfCell);
			}
			System.out.println();
			result.add(values);
		}

		String[][] returnArray = new String[result.size()][maxColumnSize];
		for (int i = 0; i < returnArray.length; i++) {
			returnArray[i] = (String[]) result.get(i);
		}
		return returnArray;

	}
	  
	  @SuppressWarnings("static-access")
	  private static String getValue(XSSFCell xssfCell){
	    if(xssfCell.getCellType() == xssfCell.CELL_TYPE_BOOLEAN){
	      return String.valueOf( xssfCell.getBooleanCellValue());
	    }else if(xssfCell.getCellType() == xssfCell.CELL_TYPE_NUMERIC){
	      return String.valueOf( xssfCell.getNumericCellValue());
	    }else{
	      return String.valueOf( xssfCell.getStringCellValue());
	    }
	  }

	public static File uploadFile(String file1FileName, File file1) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String format = "yyyy-MM-dd_HH-mm-ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String dateStr = sdf.format(date);
		file1FileName = dateStr+"_"+file1FileName;
		String path = "F:\\share\\03-upload";  
		File file = new File(path);
		if(!file.exists())
		{
			file.mkdirs();
		}
		try {
			FileUtils.copyFile(file1, new File(path,file1FileName));
			File resultFile = new File(path+"\\"+file1FileName);
			return resultFile;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Test
	public void modifyExcel()
	{
		try {
			//excel模板路径  
	        File fi=new File("D:\\test.xls");  
	        POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(fi));  
	        //读取excel模板  
	        HSSFWorkbook wb = new HSSFWorkbook(fs);  
	        //读取了模板内所有sheet内容  
	        HSSFSheet sheet = wb.getSheetAt(0);  
	        //在相应的单元格进行赋值
	        HSSFRow tempRow;
	        HSSFCell cell;
	        for(int i=4;i<7;i++)
	        {
	        	tempRow=sheet.getRow(i);
		        if(tempRow==null)
		        {
		        	tempRow = sheet.createRow(i);
		        	
		        }
		        cell = tempRow.getCell((short) (i-2));
		        if(cell==null)
	    		{
		        	cell = tempRow.createCell((short) (i-2));
	    		}
	        	cell.setCellValue("测试"+i);
	        }
	        
	        //修改模板内容导出新模板  
	        FileOutputStream out;
			out = new FileOutputStream("D:/export.xls");
			wb.write(out);  
	        out.close();  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
	}
}