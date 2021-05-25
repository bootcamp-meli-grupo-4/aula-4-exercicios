package dakar;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(1000d, 1000d, "Corrida maluca", 4);
        corrida.registrarCarro(100d,100d,10d, "GGG-0000");
        corrida.registrarCarro(100d,100d,10d, "GGG-2222");
        corrida.registrarMoto(100d,100d,10d, "GGG-9999");
        corrida.registrarMoto(100d,100d,10d, "GGG-1111");
        corrida.registrarCarro(100d,100d,10d, "GGG-3333");

        //testa vencedor
//        Veiculo vencedor = corrida.vencedor();
//        System.out.println("Vencedor: " + vencedor.getPlaca());
//
//        //testa socorrer
//        corrida.socorrer("GGG-9999");
//        corrida.socorrer("GGG-8888");
//
//        //testa remover
//        corrida.removerVeiculoPorPlaca("GGG-8888");
//        for (Veiculo veiculo: corrida.getVeiculoList()) {
//            System.out.println(veiculo);
//        }

        while (!corrida.correr());
        System.out.println(corrida.getCampeao().get().toString());
    }
}
