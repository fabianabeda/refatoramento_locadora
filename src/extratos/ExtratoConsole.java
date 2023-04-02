package extratos;

import java.util.Iterator;
import java.util.List;

import locadora.Aluguel;


public class ExtratoConsole extends Extrato{

    @Override
    public String criarExtrato(List<Aluguel> midiasAlugadas, int pontosDeAlugadorFrequente, String nome, double valorTotal) {
		
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = midiasAlugadas.iterator();
        
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + nome + fimDeLinha);
        
        while (alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();
            
            resultado.append(aluguel.getMidias().getTitulo())
                    
                    .append(" ")
                    .append(aluguel.getValorDoAluguel())
                    .append(aluguel.hasConsole() ? " - " + aluguel.getMidias().getConsole() : " - Não especificado")
                    .append(fimDeLinha);
        }
        
        resultado.append("\nValor total pago: R$ ")
                
                .append(valorTotal)
                .append(fimDeLinha)
                .append("Voce acumulou ")
                .append(pontosDeAlugadorFrequente)
                .append(" pontos de alugador frequente\n");

        return resultado.toString();
        
    }

    
    
}
