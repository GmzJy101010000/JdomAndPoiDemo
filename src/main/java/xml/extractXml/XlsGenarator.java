package xml.extractXml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.omg.CORBA.PUBLIC_MEMBER;



public class XlsGenarator {

    public static void main(String[] args) {

        String [] title = {"id","name","sex"};
        //创建excel工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建一个工作表sheet
        HSSFSheet sheet = workbook.createSheet();
       
        //创建第一行
        HSSFRow row = sheet.createRow(0);
       row.createCell(0).setCellValue("State Street Global Advisor");
     Map<String, String> sectorMap=new HashMap<String, String>();
     sectorMap.put("s1", "100%");
     sectorMap.put("s2", "100%");
     sectorMap.put("s3", "100%");
   // sectorMap.put("s4", "100%");
   //  sectorMap.put("s5", "100%");
   //  sectorMap.put("s6", "100%");
     Map<String, String> comMap=new HashMap<String, String>();
   //  comMap.put("1 day", "1%");
     comMap.put("2-30 day", "2-30%");
     comMap.put("30-60 day", "30-60%");
     comMap.put("60-90 day", "60-90%");
     comMap.put("over 90 day", "90-100%");
     Map<String, String> toptenMap=new HashMap<String, String>();
     toptenMap.put("a", "100%");
     toptenMap.put("b", "100%");
     toptenMap.put("c", "100%");
     toptenMap.put("d", "100%");
     toptenMap.put("e", "100%");
     toptenMap.put("f", "100%");
     toptenMap.put("g", "100%");
     toptenMap.put("h", "100%");
     toptenMap.put("i", "100%");
     toptenMap.put("j", "100%");
     toptenMap.put("k", "100%");
     int i=1;
     
     //first map
     Set<String> sectorSet=sectorMap.keySet();
     Iterator<String> sectorIterator=sectorSet.iterator();
     while(sectorIterator.hasNext()){
    	 String key=sectorIterator.next();
    	 row=sheet.createRow(i);
    	 row.createCell(0).setCellValue(key);
    	 row.createCell(1).setCellValue(sectorMap.get(key));
    	 i++;
     }
   
     //
     Set<String> comSet=comMap.keySet();
     Iterator<String> comIterator=comSet.iterator();
     int comSize=comSet.size();
    	if(comSize==4){		 
    			 while(comIterator.hasNext()){
    				 String key=comIterator.next();
    				 if(key.equals("2-30 day")){
    	    				row=sheet.getRow(1)!=null?sheet.getRow(1):sheet.createRow(1);
    	    				row.createCell(2).setCellValue(key);
    	    	        	 row.createCell(3).setCellValue(comMap.get(key));
    	    				}
    	    			if(key.equals("30-60 day")){
    	    				row=sheet.getRow(2)!=null?sheet.getRow(2):sheet.createRow(2);
    	    				row.createCell(2).setCellValue(key);
    	    	        	 row.createCell(3).setCellValue(comMap.get(key));
    	    				}
    	    			if(key.equals("60-90 day")){
    	    				row=sheet.getRow(3)!=null?sheet.getRow(3):sheet.createRow(3);
    	    				row.createCell(2).setCellValue(key);
    	    	        	 row.createCell(3).setCellValue(comMap.get(key));
    	    				}
    	    			if(key.equals("over 90 day")){
    	    				row=sheet.getRow(4)!=null?sheet.getRow(4):sheet.createRow(4);
    	    				row.createCell(2).setCellValue(key);
    	    	        	 row.createCell(3).setCellValue(comMap.get(key));
    	    				}
    				 
    				 
    			 }
    			 
    		 } 	 
    	 if(comSize==5){
    		 while(comIterator.hasNext()){
				 String key=comIterator.next();
				 if(key.equals("1 day")){
	    				row=sheet.getRow(1)!=null?sheet.getRow(1):sheet.createRow(1);
	    				row.createCell(2).setCellValue(key);
	    	        	 row.createCell(3).setCellValue(comMap.get(key));
	    				}
	    			if(key.equals("2-30 day")){
	    				row=sheet.getRow(2)!=null?sheet.getRow(2):sheet.createRow(2);
	    				row.createCell(2).setCellValue(key);
	    	        	 row.createCell(3).setCellValue(comMap.get(key));
	    				}
	    			if(key.equals("30-60 day")){
	    				row=sheet.getRow(3)!=null?sheet.getRow(3):sheet.createRow(3);
	    				row.createCell(2).setCellValue(key);
	    	        	 row.createCell(3).setCellValue(comMap.get(key));
	    				}
	    			if(key.equals("60-90 day")){
	    				row=sheet.getRow(4)!=null?sheet.getRow(4):sheet.createRow(4);
	    				row.createCell(2).setCellValue(key);
	    	        	 row.createCell(3).setCellValue(comMap.get(key));
	    				}
	    			if(key.equals("over 90 day")){
	    				row=sheet.getRow(5)!=null?sheet.getRow(5):sheet.createRow(5);
	    				row.createCell(2).setCellValue(key);
	    	        	 row.createCell(3).setCellValue(comMap.get(key));
	    				}
				 
			 }
    		 }
              
     i=1;
     Set<String> topSet=toptenMap.keySet();
     Iterator<String> topIterator=topSet.iterator();
     while(topIterator.hasNext()){
    	 String key=topIterator.next();
    	 row=sheet.getRow(i)!=null?sheet.getRow(i):sheet.createRow(i);
        	 row.createCell(4).setCellValue(key);
        	 row.createCell(5).setCellValue(toptenMap.get(key));
        	 row.setHeight((short) 350);
    	 i++;
     }
     
     
     
    // sheet.setDefaultRowHeight((short) 400);
   //  HSSFCellStyle style = workbook.createCellStyle();
        //创建一个文件
        File file = new File("D:/Users/ZGM/Desktop/XLS/zgm.xls");
        try {
            file.createNewFile();
            //创建输出流 
            FileOutputStream stream = FileUtils.openOutputStream(file);
            //将拼好的Excel写入到文件流
            workbook.write(stream);
            //关闭输出流
            stream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


