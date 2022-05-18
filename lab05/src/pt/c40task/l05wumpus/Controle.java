package pt.c40task.l05wumpus;

import java.util.HashSet;

public class Controle {
	private static char[] movValidos = {'w', 'a', 's', 'd', 'a', 'k', 'c', 'q'};
	private HashSet<Character> movimentosValidos;
	private Heroi hero;
	private Caverna cave;
	private char status;
	
	
	public Controle(Heroi hero, Caverna cave) {
		this.hero = hero;
		this.cave = cave;
		this.status = 'P';
		
		movimentosValidos = new HashSet<Character>();
		for (int i = 0; i < movValidos.length; i++)
			movimentosValidos.add(movValidos[i]);
	}

	
	public void realizarComando(char comando) {
		if (movimentosValidos.contains(comando)) {
			if (comando == 'k')
				hero.equiparFlecha();
			else if (comando == 'c')
				hero.pegarOuro();
			else {
				this.hero.mover(comando);
				if (!hero.isVivo())
					status = 'L';
				if (hero.getGanhou())
					status = 'W';
			}
		}
	}
	
	
	public char[][] getEstadoCaverna() {
		return cave.getRepresentacaoCaverna();
	}
	
	
	public int getPontuacao() {
		return hero.getPontuacao();
	}


	public char getStatus() {
		return status;
	}
	
	public String estaSentindoBrisa(){
		if (hero.isSentindoBrisa()) {
			return " Sim";
		}
		else {
			return " N�o";
		}
	}		
	
	public String estaSentindoFedor() {
		if (hero.isSentindoFedor()) {
			return " Sim";
		}
		else {
			return " N�o";
		}
	}
}
