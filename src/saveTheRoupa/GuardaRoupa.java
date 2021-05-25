package saveTheRoupa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Integer identificador;
    private   Map<Integer, List<Vestuario>> vestuarios;

    public GuardaRoupa() {
        this.vestuarios = new HashMap<>();
        this.identificador = 0;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Map<Integer, List<Vestuario>> getHashMap() {
        return vestuarios;
    }

    public void setHashMap(Map<Integer, List<Vestuario>> hashMap) {
        vestuarios = hashMap;
    }

    private Integer geraIdentificador(){
      return ++this.identificador;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        this.vestuarios.put(this.geraIdentificador(), listaDeVestuario);
        return this.identificador;
    }

    public void mostrarVestuarios(){
        for(Map.Entry<Integer, List<Vestuario>> map : this.vestuarios.entrySet()) {
            map.getValue().stream().forEach(m -> System.out.println("ID: "+map.getKey()+" - "+m.toString()));
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
      return this.vestuarios.remove(id);
    }
}
