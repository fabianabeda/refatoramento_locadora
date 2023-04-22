package locadora;

import abstrata.Classificacao;
import classificacoes.ClassificacaoLancamento;
import classificacoes.ClassificacaoNormal;
import classificacoes.ClassificacaoOnline;
import interfaces.Alugavel;

public class Jogo implements Alugavel {
    private final String titulo;
    private String console;
    private Classificacao classificacao;

    public Jogo(String titulo, String console, int codigoDePreco) {
        this.titulo = titulo;
        this.console = console;
        this.setCodigoDePreco(codigoDePreco);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConsole() {
        return console;
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
}