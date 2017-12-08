package com.beingjavaguys.utility;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.beingjavaguys.domain.User;


public class ExcelBuilder extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// get data model which is passed by the Spring container
		List<User> userList = (List<User>) model.get("userList");
		
		// create a new First Excel sheet
		HSSFSheet sheet = workbook.createSheet("First");
		sheet.setDefaultColumnWidth(30);
		
		// create style for header cells
		CellStyle style = workbook.createCellStyle();
		Font font = workbook.createFont();
		font.setFontName("Arial");
		style.setFillForegroundColor(HSSFColor.BLUE.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.WHITE.index);
		style.setFont(font);
		
		// create header row
		HSSFRow header = sheet.createRow(0);
		
		header.createCell(0).setCellValue("User Id");
		header.getCell(0).setCellStyle(style);
		
		header.createCell(1).setCellValue("First Name");
		header.getCell(1).setCellStyle(style);
		
		header.createCell(2).setCellValue("Last Name");
		header.getCell(2).setCellStyle(style);
		
		header.createCell(3).setCellValue("Gender");
		header.getCell(3).setCellStyle(style);
		
		header.createCell(4).setCellValue("City");
		header.getCell(4).setCellStyle(style);
		
		// create data rows
		int rowCount = 1;
		
		for (User aBook : userList) {
			HSSFRow aRow = sheet.createRow(rowCount++);
			aRow.createCell(0).setCellValue(aBook.getUserId());
			aRow.createCell(1).setCellValue(aBook.getFirstName());
			aRow.createCell(2).setCellValue(aBook.getLastName());
			aRow.createCell(3).setCellValue(aBook.getGender());
			aRow.createCell(4).setCellValue(aBook.getCity());
		}
		
		
		// create a new Second Excel sheet
		HSSFSheet sheetSecond = workbook.createSheet("Second");
		sheetSecond.setDefaultColumnWidth(30);
		
		// create style for header cells
		CellStyle styleSecond = workbook.createCellStyle();
		Font fontSecond = workbook.createFont();
		fontSecond.setFontName("Arial");
		styleSecond.setFillForegroundColor(HSSFColor.BLUE.index);
		styleSecond.setFillPattern(CellStyle.SOLID_FOREGROUND);
		fontSecond.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		fontSecond.setColor(HSSFColor.WHITE.index);
		styleSecond.setFont(fontSecond);
		
		// create header row
		HSSFRow headerSecond = sheetSecond.createRow(0);
		
		headerSecond.createCell(0).setCellValue("User Id");
		headerSecond.getCell(0).setCellStyle(styleSecond);
		
		headerSecond.createCell(1).setCellValue("First Name");
		headerSecond.getCell(1).setCellStyle(styleSecond);
		
		headerSecond.createCell(2).setCellValue("Last Name");
		headerSecond.getCell(2).setCellStyle(styleSecond);
		
		headerSecond.createCell(3).setCellValue("Gender");
		headerSecond.getCell(3).setCellStyle(styleSecond);
		
		headerSecond.createCell(4).setCellValue("City");
		headerSecond.getCell(4).setCellStyle(styleSecond);
		
		// create data rows
		int rowCountSecond = 1;
		
		for (User aBook : userList) {
			HSSFRow aRow = sheetSecond.createRow(rowCountSecond++);
			aRow.createCell(0).setCellValue(aBook.getUserId());
			aRow.createCell(1).setCellValue(aBook.getFirstName());
			aRow.createCell(2).setCellValue(aBook.getLastName());
			aRow.createCell(3).setCellValue(aBook.getGender());
			aRow.createCell(4).setCellValue(aBook.getCity());
		}
	}



}