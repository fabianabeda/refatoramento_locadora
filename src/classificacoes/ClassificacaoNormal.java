package classificacoes;

public class ClassificacaoNormal extends Classificacao {
    private static final int CODIGO_DE_PRECO_NORMAL = 0;
    private static final double PRECO_DIARIO = 2.0;
    private static final double PRECO_DIARIO_ADICIONAL = 1.5;

    @Override
    public int getCodigoDePreco() {
        return CODIGO_DE_PRECO_NORMAL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double valorDoAluguel = 0.0;
        valorDoAluguel = PRECO_DIARIO;

        if (diasAlugados > 2) {
            valorDoAluguel += (diasAlugados - 2) * PRECO_DIARIO_ADICIONAL;
        }
        return valorDoAluguel;
    }
}