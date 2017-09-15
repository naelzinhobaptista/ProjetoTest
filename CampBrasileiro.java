package br.ufpb.javasport;

import java.util.ArrayList;
import java.util.List;

public class CampBrasileiro {
	private List<Time> times;
	private List<Rodada> rodadas;
	private String tabela;
	private String datas;
	
	public CampBrasileiro(){
		this.times = new ArrayList<Time>();
		this.rodadas = new ArrayList<Rodada>();
	}
	
	public CampBrasileiro(String tabela, String data){
		this.tabela = tabela;
		this.datas = data;
	}
	
	public String toString(){
		return "Classificação: "+this.tabela;
	}

}
