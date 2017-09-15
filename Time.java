package br.ufpb.javasport;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nomeTime;
	private String estadio;
	private String classificacao;
	private List<Jogador> jogadores;
	
	public Time(String nome, String estadio, String classificacao){
		this.nomeTime = nome;
		this.estadio = estadio;
		this.classificacao = classificacao;
		jogadores = new ArrayList();
	}
	
	public String getNomeTime(){
		return this.nomeTime;
	}
	
	public void setNomeTime(String novoNome){
		this.nomeTime = novoNome;
	}
	
	public String getEstadio(){
		return this.estadio;
	}
	
	public void setEstadio(String novoEstadio){
		this.estadio = novoEstadio;
	}
	
	public String getClassificacao(){
		return this.classificacao;
	}
	
	public void setClassificacao(String novaClassificacao){
		this.classificacao = novaClassificacao;
	}
	
	public String toString(){
	String escalacao = "";
		for(Jogador a: jogadores){
			escalacao += a.getNome()+ " ";
		}
		return "Time: "+this.nomeTime+ " Estádio: "+this.estadio+ " Classificação: "+this.classificacao + " Escalação: "+escalacao;
	}


}
