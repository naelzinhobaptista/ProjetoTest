package br.ufpb.sistime;

public class Jogador {
	private String nome;
	private int numero;
	private Posicao pos;
	
	public Jogador(String nome, int numero, Posicao pos){
		this.nome = nome;
		this.numero = numero;
		this.pos = pos;
	}
	public Jogador(){
		
	}
	
	public Posicao getPos() {
		return pos;
	}
	public void setPos(Posicao pos) {
		this.pos = pos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
