package extratos;
import java.util.List;
import locadora.Aluguel;

public abstract class Extrato {
    
    public abstract String criarExtrato(List<Aluguel> midiasAlugadas, int pontosDeAlugadorFrequente, String nome, double valorTotal);

    public static Extrato selecionarExtrato(String codExtrato){
        switch (codExtrato) {
			case "1":
				return new ExtratoConsole();
				
			case "2":
				return new ExtratoHTML();		
			default:
				return null;
		}
    }

    
}
