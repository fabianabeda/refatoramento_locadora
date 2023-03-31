package extratos;
import java.util.List;
import locadora.Aluguel;

public abstract class Extrato {
    
    public abstract String send(List<Aluguel> midiasAlugadas);
}
