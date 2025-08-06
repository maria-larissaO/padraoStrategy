package estrategia;

public class RedesSociaisMarketing implements EstrategiaMarketing {
    @Override
    public void executarEstrategia(String nomeCampanha) {
        System.out.println("📱 Divulgando nas redes sociais a campanha: " + nomeCampanha); //Simula a estratégia de redes sociais.
    }
}
