package br.ufpb.javasport;

public class Jogador {
	private String nome;
	private String time;
	
	public Jogador(String nome, String time, int idade){
		this.nome = nome;
		this.time = time;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	
	public String getTime(){
		return this.time;
	}
	
	public void setTime(String novoTime){
		this.time = novoTime;
	}
	
	public String toString(){
		return "Jogador: "+this.nome+" Funcionário do: "+this.time;
	}

}
