package extratos;

import java.util.Iterator;
import java.util.List;

import locadora.Aluguel;


public class ExtratoConsole extends Extrato{

    @Override
    public String send(List<Aluguel> midiasAlugadas) {
		
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = midiasAlugadas.iterator();
        
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + "getNome()" + fimDeLinha);
        
        while (alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();

            switch (aluguel.getClass().getName()) {
                case "DVD":
                    
                    break;
                case "Jogo":
                    
                    break;
            
                default:
                    break;
            }

            
            resultado.append(aluguel.getMidias().getTitulo())
                    .append(" ")
                    .append(aluguel.getValorDoAluguel())
                    .append(fimDeLinha);
        }
        
        resultado.append("Valor total pago: R$ ")
                .append( "getValorTotal()")
                .append(fimDeLinha)
                .append("Voce acumulou ")
                .append("getPontosDeAlugadorFrequente()")
                .append(" pontos de alugador frequente");

        return resultado.toString();
        
    }

    
    
}
