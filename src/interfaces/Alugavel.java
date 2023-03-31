package interfaces;

import classificacoes.TipoConsole;

public interface Alugavel {
    String getTitulo();

    double getValorDoAluguel(int diasAlugados);

    int getPontosDeAlugadorFrequente(int diasAlugados);

    public boolean hasConsole();

    public TipoConsole getConsole();
}

