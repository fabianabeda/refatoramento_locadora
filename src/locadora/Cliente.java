package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Aluguel> midiasAlugadas = new ArrayList<Aluguel>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaAluguel(Aluguel aluguel) {
		midiasAlugadas.add(aluguel);
	}

	public String extrato() {
		final String fimDeLinha = System.getProperty("line.separator");
		Iterator<Aluguel> alugueis = midiasAlugadas.iterator();
		StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() + fimDeLinha);
		while (alugueis.hasNext()) {
			Aluguel aluguel = alugueis.next();
			resultado.append(aluguel.getMidias().getTitulo())
					.append(" ")
					.append(aluguel.getValorDoAluguel())
					.append(fimDeLinha);
		}
		resultado.append("Valor total pago: R$ ")
				.append(this.getValorTotal())
				.append(fimDeLinha)
				.append("Voce acumulou ")
				.append(this.getPontosDeAlugadorFrequente())
				.append(" pontos de alugador frequente");

		return resultado.toString();
	}

	public String extratoHTML() {
		final String fimDeLinha = System.getProperty("line.separator");
		Iterator<Aluguel> alugueis = midiasAlugadas.iterator();
		String resultado = "<H1>Registro de Alugueis de <EM>" + getNome() +
				"</EM></H1><P>" + fimDeLinha;
		while (alugueis.hasNext()) {
			Aluguel aluguel = alugueis.next();
			// mostra valores para este aluguel
			resultado += aluguel.getMidias().getTitulo() + ": R$ " +

					aluguel.getValorDoAluguel() + "<BR>" + fimDeLinha;
		}
		resultado += "<P>Valor total pago: <EM>R$ " + getValorTotal() +
				"</EM>" + fimDeLinha;
		resultado += "<P>Voce acumulou <EM>" +
				getPontosDeAlugadorFrequente() +
				" pontos </EM> de alugador frequente";
		return resultado;
	}

	private double getValorTotal() {
		double valorTotal = 0;
		for (Aluguel aluguel : midiasAlugadas) {
			valorTotal += aluguel.getValorDoAluguel();
		}
		return valorTotal;
	}

	private int getPontosDeAlugadorFrequente() {
		int pontosDeAlugadorFrequente = 0;
		for (Aluguel aluguel : midiasAlugadas) {
			pontosDeAlugadorFrequente += aluguel.getPontosDeAlugadorFrequente();
		}
		return pontosDeAlugadorFrequente;
	}
}