package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import extratos.Extrato;
import extratos.ExtratoConsole;
import extratos.ExtratoHTML;

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

	public String extrato(String codExtrato){
		Extrato extrato = Extrato.selecionarExtrato(codExtrato);

		return extrato.criarExtrato(midiasAlugadas, getPontosDeAlugadorFrequente(), getNome(), getValorTotal());
		
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