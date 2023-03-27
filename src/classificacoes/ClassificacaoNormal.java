package classificacoes;

import abstrata.Classificacao;

public class ClassificacaoNormal extends Classificacao {
    private static final int NORMAL = 0;

    @Override
    public int getCódigoDePreço() {
        return NORMAL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double preco = 0.0;
        preco += 2.0;
        if (diasAlugados > 2) {
            preco += (diasAlugados - 2) * 1.5;
        }
        return preco;
    }
}