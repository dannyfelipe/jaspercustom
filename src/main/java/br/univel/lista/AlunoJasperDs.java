package br.univel.lista;

import java.util.Iterator;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class AlunoJasperDs implements JRDataSource {
	
	private Iterator<Aluno> iterator;
	private Aluno selecinado;
	
	

	public Object getFieldValue(JRField arg0) throws JRException {
		// TODO Auto-generated method stub
		
		if ("id".equals(arg0.getName())) {
			
		}
		
		return null;
	}

	public boolean next() throws JRException {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
