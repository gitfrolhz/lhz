package com.test;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class Test {
	public static void main(String[] args) {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("D:\\helloworld.pdf"));
			Paragraph Paragraph = new Paragraph();
			document.open();
			document.add(new Paragraph("helloworld"));
		} catch (Exception e) {
		}finally{
			document.close();
		}
		
	}

}
