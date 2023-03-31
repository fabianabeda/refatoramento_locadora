package classificacoes;

public class ClassificacaoNormal extends Classificacao {
    private static final int CÓDIGO_DE_PREÇO_NORMAL = 0;
    private static final double PREÇO_DIÁRIO = 2.0;
    private static final double PREÇO_DIÁRIO_ADICIONAL = 1.5;

    @Override
    public int getCódigoDePreço() {
        return CÓDIGO_DE_PREÇO_NORMAL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double valorDoAluguel = 0.0;
        valorDoAluguel = PREÇO_DIÁRIO;

        if (diasAlugados > 2) {
            valorDoAluguel += (diasAlugados - 2) * PREÇO_DIÁRIO_ADICIONAL;
        }
        return valorDoAluguel;
    }
}