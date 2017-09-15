package br.ufpb.javasport;

public class Jogo {
	private Time time1;
	private Time time2;
	private String data;
	private String tempo;
	private String resultado;
	
	public Jogo(Time time1,Time time2, String data, String tempo, String resultado){
		this.time1 = time1;
		this.time2 = time2;
		this.data = data;
		this.tempo = tempo;
		this.resultado = resultado;
	}
	
	public Time getTime1(){
		return this.time1;
	}
	
	public void setTime1(Time novoTime1){
		this.time1 = novoTime1;
	}
	
	public Time getTime2(){
		return this.time2;
	}
	
	public void setTime2(Time novoTime2){
		this.time2 = novoTime2;
	}
	public String getData(){
		return this.data;
	}
	
	public void setData(String novaData){
		this.data = novaData;
	}
	
	public String getTempo(){
		return this.tempo;
	}
	
	public void setTempo(String novoTempo){
		this.tempo = novoTempo;
	}
	
	public String getResultado(){
		return this.resultado;
	}
	
	public void setResultado(String novoResultado){
		this.resultado = novoResultado;
	}


}
