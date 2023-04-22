package classificacoes;

import abstrata.Classificacao;

public class ClassificacaoOnline extends Classificacao {
    private static final int CÓDIGO_DE_PREÇO_ONLINE = 4;
    private static final double PREÇO_DIÁRIO = 4.0;
    private static final double PREÇO_DIÁRIO_PROMOCIONAL = 3.0;
    private static final int DIAS_PROMOCIONAIS = 3;

    @Override
    public int getCódigoDePreço() {
        return CÓDIGO_DE_PREÇO_ONLINE;
    }

    @Override
    public double getValorDoAluguel(int diasAlugados) {
        double valorDoAluguel;
        if (diasAlugados > DIAS_PROMOCIONAIS) {
            valorDoAluguel = DIAS_PROMOCIONAIS * PREÇO_DIÁRIO_PROMOCIONAL
                    + (diasAlugados - DIAS_PROMOCIONAIS) * PREÇO_DIÁRIO;
        } else {
            valorDoAluguel = diasAlugados * PREÇO_DIÁRIO_PROMOCIONAL;
        }
        return valorDoAluguel;
    }

}