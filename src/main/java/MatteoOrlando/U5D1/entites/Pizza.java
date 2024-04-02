package MatteoOrlando.U5D1.entites;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Classe che rappresenta una pizza
public class Pizza {
    @Getter
    @Setter
    private String nome;
    @Getter
    private double prezziBase;
    private List<Aggiunta> aggiunta;
    public String getAggiunta() {
        return aggiunta.toString();
    }
    
    public void setAggiunta(List<Aggiunta> list) {
    }
}
