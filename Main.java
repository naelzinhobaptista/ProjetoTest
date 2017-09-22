package br.ufpb.sistime;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String timeCasa = JOptionPane.showInputDialog("Informe o time da casa: ");
		int quantGolsCasa = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols o "+timeCasa+" marcou? "));
		
		String timeVis = JOptionPane.showInputDialog("Informe o time visitante: ");
		int quantGolsVis = Integer.parseInt(JOptionPane.showInputDialog("Quantos gols o "+timeVis+" marcou? ")); 
		
		Time t1 = new Time(timeCasa, quantGolsCasa);
		Time t2 = new Time(timeVis, quantGolsVis);
		
		Partida p = new Partida(t1, t2);
		p.getResultado();
		
		System.out.println(p);
	}

}
