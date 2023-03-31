package locadora;

import classificacoes.Classificacao;
import classificacoes.ClassificacaoLancamento;
import classificacoes.ClassificacaoNormal;
import classificacoes.ClassificacaoOnline;
import interfaces.Alugavel;
import classificacoes.TipoConsole;

public class Jogo implements Alugavel {
    private final String titulo;
    private TipoConsole tipoConsole;
    private Classificacao classificacao;

    public Jogo(String titulo, TipoConsole console, int codigoDePreco) {
        this.titulo = titulo;
        this.tipoConsole = console;
        this.setCodigoDePreco(codigoDePreco);
    }

    public String getTitulo() {
        return titulo;
    }

    public TipoConsole getConsole() {
        return tipoConsole;
    }

    public int getCódigoDePreço() {
        return classificacao.getCódigoDePreço();
    }

    public void setCodigoDePreco(int codigoDePreco) {
        if (codigoDePreco == 0) {
            this.classificacao = new ClassificacaoNormal();
        } else if (codigoDePreco == 1) {
            this.classificacao = new ClassificacaoLancamento();
        } else {
            this.classificacao = new ClassificacaoOnline();
        }
    }

    public double getValorDoAluguel(int diasAlugados) {
        return this.classificacao.getValorDoAluguel(diasAlugados);
    }

    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return classificacao.getPontosDeAlugadorFrequente(diasAlugados);
    }

    public boolean hasConsole(){
		return true;
	}
}