package br.ufpb.sistime;

public class Partida {
	private Time timeCasa, timeVis;
	private int qtdGolsTimeCasa, qtdGolsTimeVis;
	private String resultado;
	
	public int getQtdGolsTimeVis() {
		return qtdGolsTimeVis;
	}
	public void setQtdGolsTimeVis(int qtdGolsTimeVis) {
		this.qtdGolsTimeVis = qtdGolsTimeVis;
	}
	public Partida(Time timeCasa, Time timeVis, int qtdGolsTimeCasa, int qtdGolsTimeVis){
		this.timeCasa = timeCasa;
		this.timeVis = timeVis;
		this.qtdGolsTimeCasa = qtdGolsTimeCasa;
		this.qtdGolsTimeVis = qtdGolsTimeVis;
	}
	public void Resultado(){
		if(qtdGolsTimeCasa > qtdGolsTimeVis){
			timeCasa.setPontos(timeCasa.getPontos()+ 3);
			timeCasa.setVitoria(timeCasa.getVitoria()+ 1);
			timeVis.setDerrota(timeVis.getDerrota() + 1);
			resultado = "Vencedor: "+timeCasa.toString();
			
		}else if(qtdGolsTimeVis > qtdGolsTimeCasa){
			timeVis.setPontos(timeVis.getPontos()+ 3);
			timeVis.setVitoria(timeVis.getVitoria()+ 1);
			timeCasa.setDerrota(timeCasa.getDerrota() + 1);
			resultado = "Vencedor: "+timeVis.toString();
			
		}else{
			timeCasa.setPontos(timeCasa.getPontos() + 1);
			timeVis.setPontos(timeVis.getPontos() + 1);
			timeCasa.setEmpate(timeCasa.getEmpate()+ 1);
			timeVis.setEmpate(timeVis.getEmpate() + 1);
			resultado = "Empate";
		}
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
	public int getQtdGolsTimeCasa() {
		return qtdGolsTimeCasa;
	}
	public void setQtdGolsTimeCasa(int qtdGolsTimeCasa) {
		this.qtdGolsTimeCasa = qtdGolsTimeCasa;
	}

	
}
