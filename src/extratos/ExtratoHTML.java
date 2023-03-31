package extratos;
import java.util.List;

import java.util.Iterator;

import locadora.Aluguel;

public class ExtratoHTML extends Extrato{

    @Override
    public String send(List<Aluguel> midiasAlugadas) {

            final String fimDeLinha = System.getProperty("line.separator");
            Iterator<Aluguel> alugueis = midiasAlugadas.iterator();
            String resultado = "<H1>Registro de Alugueis de <EM>" + "getNome()" +
                    "</EM></H1><P>" + fimDeLinha;
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



                // mostra valores para este aluguel
                resultado += aluguel.getMidias().getTitulo() + ": R$ " +
    
                        aluguel.getValorDoAluguel() + "<BR>" + fimDeLinha;
            }
            resultado += "<P>Valor total pago: <EM>R$ " + "getValorTotal()" +
                    "</EM>" + fimDeLinha;
            resultado += "<P>Voce acumulou <EM>" +
                    "getPontosDeAlugadorFrequente()" +
                    " pontos </EM> de alugador frequente";
                    
            return resultado.toString();
        }
    }
    

