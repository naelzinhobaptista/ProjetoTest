package br.ufpb.sistime;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private List<Jogador> jogadores;
	private final int qtdJogadores = 11;
	private String nomeTime;
	private int vitoria, empate, derrota, pontos;
	
	public Time(String nomeTime){
		this.nomeTime = nomeTime;
		jogadores = new ArrayList();
		inicializarJogadores();
	}
	
	
	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}

	
	
	public String getNomeTime() {
		return nomeTime;
	}
	
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public void inicializarJogadores(){
		for(int k = 0; k < qtdJogadores; k++){
			Jogador j = new Jogador();
			jogadores.add(j);
		}
	}
	
	public String toString(){
		return this.nomeTime;
		
	}
	public String toString2(){
		return "Até o momento o "+this.nomeTime+" tem um total de: "+this.vitoria+" vitórias\n"
				+this.empate+" empates e\n"+this.derrota+" derrotas";
		
	}

}
