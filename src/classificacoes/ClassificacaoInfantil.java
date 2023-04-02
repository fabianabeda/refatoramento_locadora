package classificacoes;

public class ClassificacaoInfantil extends Classificacao {
    private static final int CODIGO_DE_PRECO_INFANTIL = 2;
    private static final double PRECO_DIARIO = 1.5;
    private static final double PRECO_DIARIO_ADICIONAL = 1.5;

    @Override
    public int getCodigoDePreco() {
        return CODIGO_DE_PRECO_INFANTIL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double valorDoAluguel = 0.0;
        valorDoAluguel += PRECO_DIARIO;

        if (diasAlugados > 3) {
            valorDoAluguel += (diasAlugados - 3) * PRECO_DIARIO_ADICIONAL;
        }
        return valorDoAluguel;
    }

}