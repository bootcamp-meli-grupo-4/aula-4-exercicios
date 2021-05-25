package luiz.aula4.savetheropa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> armazem;

    private Integer contador = -1;

    public GuardaRoupa() {
        this.armazem = new HashMap<>();
    }

    public Integer guardarVestuarios(List<Vestuario> vestuarios) {
        contador++;
        armazem.put(contador, vestuarios);
        return contador;
    }

    private void imprimirCabecalho() {
        System.out.printf("%30s %25s %10s %25s %10s%n", "Chave", "|", "Marca", "|", "Modelo");
        System.out.printf("%s%n", "----------------------------------------------------------------------------------------------------------------");

    }

    private void imprimirVestuario(Integer chave, List<Vestuario> vestuarios) {
        for (Vestuario vestuario : vestuarios) {
            System.out.printf("%30s %25s %10s %25s %10s%n", chave, "|", vestuario.getMarca(), "|", vestuario.getModelo());
        }
    }

    public void imprimirVestuarios() {
        imprimirCabecalho();
        armazem.forEach(this::imprimirVestuario);
    }

    public List<Vestuario> retirarVestuarios(Integer id) {
        List<Vestuario> vestuarios = armazem.getOrDefault(id, new ArrayList<>());
        if(!vestuarios.isEmpty()) {
            imprimirCabecalho();
            imprimirVestuario(id, vestuarios);
        }
        return vestuarios;
    }
}
