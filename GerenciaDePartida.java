package br.ufpb.sistime;

import java.util.ArrayList;
import java.util.List;

public class GerenciaDePartida {
	//Partida[] partidas = new Partida[1];
	private static List<Partida> partidas;
	
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
		for(Partida a: partidas){
			if(a.getTimeCasa().getNomeTime().equals(p.getTimeCasa().getNomeTime())){
				a.getTimeCasa().setVitoria(p.getTimeCasa().getVitoria());
				a.getTimeCasa().setDerrota(p.getTimeCasa().getDerrota());
				a.getTimeCasa().setEmpate(p.getTimeCasa().getEmpate());
			}else{
				if(a.getTimeVis().getNomeTime().equals(p.getTimeVis().getNomeTime())){
					a.getTimeVis().setVitoria(p.getTimeVis().getVitoria());
					a.getTimeVis().setDerrota(p.getTimeVis().getDerrota());
					a.getTimeVis().setEmpate(p.getTimeVis().getEmpate());
				}else{
					partidas.add(p);
				}
			}
		}
	}

}
