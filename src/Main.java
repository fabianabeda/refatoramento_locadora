import locadora.Cliente;
import locadora.Aluguel;
import locadora.DVD;
import locadora.Jogo;

import java.util.ArrayList;

import classificacoes.TipoConsole;

public class Main {
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alex Sandro");

		c1.setMidiasAlugadas( new ArrayList<Aluguel>());

		c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", 0), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Luca", 2), 2));
		c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", 1), 30));
		c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", 1), 4));
		c1.adicionaAluguel(new Aluguel(new DVD("Moana", 2), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", 0), 3));

		c1.adicionaAluguel(new Aluguel(new Jogo("FIFA 22", TipoConsole.PS5, 4), 7));
		c1.adicionaAluguel(new Aluguel(new Jogo("Resident Evil Village", TipoConsole.PS5, 4), 3));
		c1.adicionaAluguel(new Aluguel(new Jogo("Grand Theft Auto V", TipoConsole.PS5, 4), 5));


		System.out.println(c1.extrato("2"));
		
		System.out.println(c1.extrato("1"));
	}
}
