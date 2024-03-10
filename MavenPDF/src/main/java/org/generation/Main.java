package org.generation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Main {

	public static void main(String[] args) throws MalformedURLException, IOException {
		Document doc = new Document();
		try {
			PdfWriter.getInstance(doc, new FileOutputStream("CH29.pdf"));
			doc.open();
			Image img = Image.getInstance("y.png");
			img.scaleAbsolute(100, 100);
			PdfPTable table = new PdfPTable(3);
			PdfPCell cell;
			cell = new PdfPCell(new Phrase("Recibo de Nómina"));
			cell.setColspan(3);
			table.addCell(cell);
			cell = new PdfPCell(new Phrase("Nombre"));
			cell.setRowspan(2);
			table.addCell(cell);
			table.addCell("RFC:");
			table.addCell("Fecha: ");
			table.addCell("Departamento: ");
			table.addCell("Salario: ");
			doc.add(img);
			doc.add(new Paragraph("Empresa SA de CV.\n"));
			doc.add(new Paragraph(" "));
			doc.add(table);
			doc.close();
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main

}//clase Main
