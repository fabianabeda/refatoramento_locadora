package classificacoes;

import abstrata.Classificacao;

public class ClassificacaoLancamento extends Classificacao {
    private static final int CÓDIGO_DE_PREÇO_LANÇAMENTO = 1;
    private static final double PREÇO_DIÁRIO = 3.0;

    @Override
    public int getCódigoDePreço() {
        return CÓDIGO_DE_PREÇO_LANÇAMENTO;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double valorDoAluguel = diasAlugados * PREÇO_DIÁRIO;
        return valorDoAluguel;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return diasAlugados > 1 ? 2 : 1;
    }
}