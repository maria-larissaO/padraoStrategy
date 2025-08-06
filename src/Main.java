//Cliente
//Importa todas as classes necessárias.
import contexto.CampanhaMarketing;
import estrategia.EmailMarketing;
import estrategia.RedesSociaisMarketing;
import estrategia.AnuncioPagoMarketing;

//Classe principal que executa o programa.
public class Main {
    public static void main(String[] args) {

        //Cria uma nova campanha de marketing com o nome "Black Friday 2025".
        CampanhaMarketing campanha = new CampanhaMarketing("Black Friday 2025");

        //Define a estratégia de email marketing para a campanha e executa.
        campanha.setEstrategia(new EmailMarketing());
        campanha.executarCampanha();

        //Troca para estratégia de redes sociais e executa.
        campanha.setEstrategia(new RedesSociaisMarketing());
        campanha.executarCampanha();

        //Troca para anúncios pagos e executa.
        campanha.setEstrategia(new AnuncioPagoMarketing());
        campanha.executarCampanha();
    }
}

