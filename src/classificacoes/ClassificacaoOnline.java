package classificacoes;

public class ClassificacaoOnline extends Classificacao {
    private static final int CODIGO_DE_PRECO_ONLINE = 4;
    private static final double PRECO_DIARIO = 4.0;
    private static final double PRECO_DIARIO_PROMOCIONAL = 3.0;
    private static final int DIAS_NORMAL = 3;

    @Override
    public int getCodigoDePreco() {
        return CODIGO_DE_PRECO_ONLINE;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double valorDoAluguel;
        if (diasAlugados > DIAS_NORMAL) {
            valorDoAluguel = diasAlugados * PRECO_DIARIO_PROMOCIONAL;
        } else {
            valorDoAluguel = diasAlugados * PRECO_DIARIO;
        }
        return valorDoAluguel;
    }

}