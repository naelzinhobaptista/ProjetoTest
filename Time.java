package br.ufpb.sistime;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private int qtdGols;
	private List<Jogador> jogadores;
	private final int qtdJogadores = 11;
	private String nomeTime;
	private int pontos;
	
	public Time(String nomeTime, int qtdGols){
		this.qtdGols = qtdGols;
		this.nomeTime = nomeTime;
		jogadores = new ArrayList();
		inicializarJogadores();
	}
	
	public String getNomeTime() {
		return nomeTime;
	}
	
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	
	public int getQtgGols() {
		return qtdGols;
	}

	public void setQtgGols(int qtdGols) {
		this.qtdGols = qtdGols;
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

}
