package estrategia;

public class AnuncioPagoMarketing implements EstrategiaMarketing {
    @Override
    public void executarEstrategia(String nomeCampanha) {
        System.out.println("💰 Criando anúncios pagos para a campanha: " + nomeCampanha);
    }
}
//Simula a criação de anúncios pagos para a campanha.