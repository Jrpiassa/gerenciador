package br.com.jpiassa.gerenciador.persistence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jpiassa.gerenciador.model.Empresa;

public class Banco {
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Long chaveSequencial = new Long(1); 
	
	public void adiciona(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
	}
	
	public List<Empresa> listaEmpresa(){
		return lista;
	}

	public void removeEmpresa(Integer id) {
		// TODO Auto-generated method stub
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}		
	}

	public Empresa findById(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
		
	}
}
