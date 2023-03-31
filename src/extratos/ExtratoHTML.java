package extratos;
import java.util.List;

import java.util.Iterator;

import locadora.Aluguel;

public class ExtratoHTML extends Extrato{

    @Override
    public String criarExtrato(List<Aluguel> midiasAlugadas, int pontosDeAlugadorFrequente, String nome, double valorTotal) {

            final String fimDeLinha = System.getProperty("line.separator");
            Iterator<Aluguel> alugueis = midiasAlugadas.iterator();
            String resultado = "<H1>Registro de Alugueis de <EM>" + nome +
                    "</EM></H1><P>" + fimDeLinha;
            while (alugueis.hasNext()) {
                Aluguel aluguel = alugueis.next();
                // mostra valores para este aluguel
                resultado += aluguel.getMidias().getTitulo() + ": R$ " +
    
                        aluguel.getValorDoAluguel() + "<BR>" + fimDeLinha;
            }
            resultado += "<P>Valor total pago: <EM>R$ " + valorTotal +
                    "</EM>" + fimDeLinha;
            resultado += "<P>Voce acumulou <EM>" +
                    pontosDeAlugadorFrequente +
                    " pontos </EM> de alugador frequente\n";
                    
            return resultado.toString();
        }
    }
    

