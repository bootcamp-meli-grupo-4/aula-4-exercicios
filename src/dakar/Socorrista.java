public class Socorrista<V extends Veiculo>{
    public void socorrer(V veiculo){
        if (veiculo instanceof Carro){
            System.out.println("Socorrendo carro: " + veiculo.getPlaca());
            return;
        }
        System.out.println("Socorrendo moto " + veiculo.getPlaca());
        veiculo.consertarVeiculo();
    }
}
