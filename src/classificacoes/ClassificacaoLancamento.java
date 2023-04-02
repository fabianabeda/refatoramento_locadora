package classificacoes;

public class ClassificacaoLancamento extends Classificacao {
    private static final int CODIGO_DE_PRECO_LANCAMENTO = 1;
    private static final double PREÇO_DIÁRIO = 3.0;

    @Override
    public int getCodigoDePreco() {
        return CODIGO_DE_PRECO_LANCAMENTO;
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