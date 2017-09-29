package br.ufpb.sistime;

import java.util.ArrayList;
import java.util.List;

public class GerenciaDePartida {
	//Partida[] partidas = new Partida[1];
	private List<Partida> partidas;
	
	public GerenciaDePartida(){
		partidas = new ArrayList();
	}
	
	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}

	public void addPartida(Partida p){
		partidas.add(p);
	}

}
