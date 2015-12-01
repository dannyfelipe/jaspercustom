package br.univel;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleReport {

	private String arq = "src\\main\\resources\\Rel_1.jasper";

	public SimpleReport() {
		
		JasperPrint jasperPrint = null;

		jasperPrint = JasperFillManager.fillReport(arq, null, customDs);
		
		JasperViewer jasperViewer = new JasperViewer(jasperPrint);
		
		jasperViewer.setBounds(50, 50, 320, 240);
		jasperViewer

		
		
		try {
			
		
			
			// true para exibir na tela
			jasperViewer.setVisible(true);
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}


	public static void main(String[] args) {
		new SimpleReport();
	}
}