package br.com.jpiassa.gerenciador.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.jpiassa.gerenciador.model.Empresa;

public class Banco {
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> listaEmpresa(){
		return lista;
	}
}
