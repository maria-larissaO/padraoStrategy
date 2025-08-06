//interface
package estrategia; //define que esta interface pertence ao pacote estrategia

public interface EstrategiaMarketing {  //Cria a interface EstrategiaMarketing. Interfaces definem contratos de comportamento — ou seja, métodos que as classes concretas devem implementar.
    void executarEstrategia(String nomeCampanha); //Método abstrato que será implementado por cada tipo de estratégia de marketing. Recebe o nome da campanha como argumento.
}