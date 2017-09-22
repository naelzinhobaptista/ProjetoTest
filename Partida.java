package br.ufpb.sistime;

public class Partida {
	private Time timeCasa;
	private Time timeVis;
	private String resultado;
	
	public Partida(Time timeCasa, Time timeVis){
		this.timeCasa = timeCasa;
		this.timeVis = timeVis;
		
	}
	public String Resultado(){
		if(timeCasa.getQtgGols()>timeVis.getQtgGols()){
			resultado = timeCasa.getNomeTime();
		}else if(timeCasa.getQtgGols()<timeVis.getQtgGols()){
			resultado = timeVis.getNomeTime();
		}else{
			resultado = "Empate";
		}
		return resultado;
	}

	public Time getTimeCasa() {
		return timeCasa;
	}

	public void setTimeCasa(Time timeCasa) {
		this.timeCasa = timeCasa;
	}

	public Time getTimeVis() {
		return timeVis;
	}

	public void setTimeVis(Time timeVis) {
		this.timeVis = timeVis;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	
}
