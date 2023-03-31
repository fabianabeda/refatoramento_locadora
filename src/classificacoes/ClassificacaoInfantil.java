package classificacoes;

public class ClassificacaoInfantil extends Classificacao {
    private static final int CÓDIGO_DE_PREÇO_INFANTIL = 2;
    private static final double PREÇO_DIÁRIO = 1.5;
    private static final double PREÇO_DIÁRIO_ADICIONAL = 1.5;

    @Override
    public int getCódigoDePreço() {
        return CÓDIGO_DE_PREÇO_INFANTIL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double valorDoAluguel = 0.0;
        valorDoAluguel += PREÇO_DIÁRIO;

        if (diasAlugados > 3) {
            valorDoAluguel += (diasAlugados - 3) * PREÇO_DIÁRIO_ADICIONAL;
        }
        return valorDoAluguel;
    }

}