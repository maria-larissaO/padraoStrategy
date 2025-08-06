package contexto;

import estrategia.EstrategiaMarketing;
/*Classe CampanhaMarketing no pacote contexto. Ela usa a interface EstrategiaMarketing. */

//Início da classe principal que representa uma campanha de marketing.
public class CampanhaMarketing {

    //Atributos privados: nome da campanha e a estrategia usada.
    private String nome;
    private EstrategiaMarketing estrategia;

    //Construtor que recebe o nome da campanha.
    public CampanhaMarketing(String nome) {
        this.nome = nome;
    }

    //Define dinamicamente qual estratégia será usada na campanha.
    public void setEstrategia(EstrategiaMarketing estrategia) {
        this.estrategia = estrategia;
    }

    //Executa a campanha usando a estratégia selecionada. Se não tiver estratégia, emite um alerta.
    public void executarCampanha() {
        if (estrategia == null) {
            System.out.println("⚠ Nenhuma estratégia definida para a campanha: " + nome);
        } else {
            estrategia.executarEstrategia(nome);
        }
    }
}
