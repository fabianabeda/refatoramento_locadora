package locadora;

import interfaces.Alugavel;

public class Aluguel {
	private Alugavel alugavel;
	private int diasAlugado;
	private double preco;

	public Aluguel(Alugavel alugavel, int diasAlugado) {
		this.alugavel = alugavel;
		this.diasAlugado = diasAlugado;
		this.preco = 0;
	}

	public Alugavel getMidias() {
		return alugavel;
	}

	public int getDiasAlugado() {
		return diasAlugado;
	}

	public enum Console {
		PS5,
		Xbox_Series_S,
		Nintendo_Switch,
		// outros consoles aqui
	}

	public double getValorDoAluguel() {
		this.preco = this.getMidias().getValorDoAluguel(this.getDiasAlugado());
		return this.preco;

	}

	public int getPontosDeAlugadorFrequente() {
		return this.getMidias().getPontosDeAlugadorFrequente(this.getDiasAlugado());
	}

	public String getTitulo() {
		return alugavel.getTitulo();
	}

	public String getConsole() {
		return alugavel.getConsole();
	}
}