package MatteoOrlando.U5D1.entites;

//import lombok.Getter;

import lombok.Getter;
import lombok.Setter;

public class Aggiunta {
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private double prezzo;



    public Aggiunta(String nome, double prezzo, String informazioniNutrizionali) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

}
