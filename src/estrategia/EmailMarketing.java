package estrategia; //A classe está no pacote estrategia.

public class EmailMarketing implements EstrategiaMarketing { //Define a classe EmailMarketing, que implementa a interface EstrategiaMarketing.
    @Override
    /*Implementação do método da interface. 
    O @Override indica que está sobrescrevendo um método da interface. */
    public void executarEstrategia(String nomeCampanha) {
        System.out.println("📧 Enviando e-mails para os clientes da campanha: " + nomeCampanha); //Simula a execução da estratégia imprimindo uma mensagem no console.
    }
}
