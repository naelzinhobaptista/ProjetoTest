package br.ufpb.sistime;

import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	private static GerenciaDePartida gerente = new GerenciaDePartida();
	
	public static void main(String[] args) {

		boolean sair = false;
		Partida p = null;
		GerenciaDePartida g = new GerenciaDePartida();
		while (sair == false) {
			
			String menu = JOptionPane.showInputDialog("1- Adicionar Partida\n2- Ver Resultado das Partidas\n"
					+ "3- Quantidade de Vitórias, Empates e Derrotas\n4- Quantidade de Pontos\n5 - Gravar Arquivo\n"
					+ "6 - Sair");
			
			switch (menu) {
			case "1":
				
				String timeCasa = JOptionPane.showInputDialog("Informe o time da casa: ");
				/*List<Partida> pp = gerente.getPartidas();
				for(Partida par: pp){
					if(par.getTimeCasa().getNomeTime().equals(timeCasa)){
						par.getTimeCasa().setVitoria(par.getTimeCasa().getVitoria()+ 1);
					}
				}*/
				int quantGolsCasa = Integer
						.parseInt(JOptionPane.showInputDialog("Quantos gols o " + timeCasa + " marcou? "));

				String timeVis = JOptionPane.showInputDialog("Informe o time visitante: ");
				int quantGolsVis = Integer
						.parseInt(JOptionPane.showInputDialog("Quantos gols o " + timeVis + " marcou? "));

				Time t1 = new Time(timeCasa);
				Time t2 = new Time(timeVis);

				p = new Partida(t1, t2, quantGolsCasa, quantGolsVis);
				g.addPartida(p);
				break;

			case "2":

				try {
					p.Resultado();
					String rr = p.getResultado();

					JOptionPane.showMessageDialog(null, rr);
				} 
				catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Não foi encontrada nenhuma partida!");
					continue;
				}
				break;
				
			case "3":
				String nomeTime = JOptionPane.showInputDialog("Informe o nome do time: ");
				List<Partida> lista = g.getPartidas();
				for(Partida pa: lista){
					if(pa.getTimeCasa().getNomeTime().equals(nomeTime)){
						JOptionPane.showMessageDialog(null ,pa.Estatistica());
						break;
					}
				}
				break;
			}
		}
	}

}
