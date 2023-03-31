package locadora;

import classificacoes.Classificacao;
import classificacoes.ClassificacaoInfantil;
import classificacoes.ClassificacaoLancamento;
import classificacoes.ClassificacaoNormal;
import interfaces.Alugavel;

public class DVD implements Alugavel {
	private Classificacao classificacao;
	private final String titulo;

	public DVD(String titulo, int codigoDePreco) {
		this.titulo = titulo;
		this.setCodigoDePreco(codigoDePreco);
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCódigoDePreco() {
		return classificacao.getCódigoDePreço();
	}

	public void setCodigoDePreco(int codigoDePreco) {
		if (codigoDePreco == 0) {
			this.classificacao = new ClassificacaoNormal();
		} else if (codigoDePreco == 1) {
			this.classificacao = new ClassificacaoLancamento();
		} else {
			this.classificacao = new ClassificacaoInfantil();
		}

	}

	public double getValorDoAluguel(int diasAlugados) {
		return this.classificacao.getValorDoAluguel(diasAlugados);

	}

	public int getPontosDeAlugadorFrequente(int diasAlugados) {
		return classificacao.getPontosDeAlugadorFrequente(diasAlugados);
	}

}