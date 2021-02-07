package DAOClasses;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import POJOClasses.pojoCalculator;
import POJOClasses.pojoInsertValue;
import POJOClasses.pojoSearch;

public class DBReport {
	


		
		public static boolean FullLoan() throws FileNotFoundException, DocumentException, ClassNotFoundException, SQLException {
			Document document = new Document();
			
			PdfWriter  writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\GeneratedReports\\LoanDetails.pdf"));
			document.open();
			
			try {
				BaseFont base = BaseFont.createFont("C:\\Windows\\Fonts\\GOTHIC.TTF",BaseFont.WINANSI,BaseFont.EMBEDDED);
			
			
			Font pfont = new Font(base, 12, Font.BOLD ,BaseColor.DARK_GRAY);
			Font hfont = new Font(base, 10, Font.BOLD);
			Font dfont = new Font(base, 10, Font.NORMAL);
			
//	         img.setAbsolutePosition(390, 720);
	         
	         
	     
	         
//			Paragraph p1 = new Paragraph("Full History in Inventory Management System");
//			
//			p1.setFont(pfont);
//			p1.setAlignment(Element.ALIGN_CENTER);

			document.add(new Paragraph("Loan MAnagement System Calculation Details",pfont));
			
			PdfPTable table = new PdfPTable(3);
			table.setWidthPercentage(110);
			
			
			table.setSpacingAfter(11f);
			table.setSpacingBefore(11f);
			
			
			float [] colWidth = {1.5f,1.8f,1.3f};
			table.setWidths(colWidth);
			PdfPCell ch1=new PdfPCell (new Paragraph("LoanID",hfont));
			PdfPCell ch2=new PdfPCell (new Paragraph("LoanType",hfont));
			PdfPCell ch3=new PdfPCell (new Paragraph("LoanRate",hfont));
			
			
			ch1.setHorizontalAlignment(Element.ALIGN_CENTER);
			ch2.setHorizontalAlignment(Element.ALIGN_CENTER);
			ch3.setHorizontalAlignment(Element.ALIGN_CENTER);
			
			ch1.setPadding(5f);
			ch2.setPadding(5f);
			ch3.setPadding(5f);
			
			
			
			table.addCell(ch1);
			table.addCell(ch2);
			table.addCell(ch3);
			
			ArrayList<pojoInsertValue> list =DBRetriveData.RetriveSearchquery();
			
			
			
			int x=0;
			while(x<list.size()) {
				pojoInsertValue h1 = list.get(x);
				PdfPCell ch10=new PdfPCell (new Paragraph(h1.getId(),dfont));
				PdfPCell ch11=new PdfPCell (new Paragraph(h1.getType(),dfont));
				PdfPCell ch12=new PdfPCell (new Paragraph(h1.getRate(),dfont));
				
				ch10.setHorizontalAlignment(Element.ALIGN_CENTER);
				ch11.setHorizontalAlignment(Element.ALIGN_CENTER);
				ch12.setHorizontalAlignment(Element.ALIGN_CENTER);
				
				ch10.setVerticalAlignment(Element.ALIGN_MIDDLE);
				ch11.setVerticalAlignment(Element.ALIGN_MIDDLE);
				ch12.setVerticalAlignment(Element.ALIGN_MIDDLE);
				
				ch10.setPadding(5f);
				ch11.setPadding(5f);
				ch12.setPadding(5f);
				
				table.addCell(ch10);
				table.addCell(ch11);
				table.addCell(ch12);
				
				x++;
			}
					
			
			
			document.add(table);
			document.close();
			writer.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return true;
			
			
		}

		


}
