package classificacoes;

public abstract class Classificacao {
    public abstract int getCódigoDePreço();

    public abstract double getValorDoAluguel(int diasAlugados);

    public int getPontosDeAlugadorFrequente(int diasAlugados) {
        return 1;
    }
}