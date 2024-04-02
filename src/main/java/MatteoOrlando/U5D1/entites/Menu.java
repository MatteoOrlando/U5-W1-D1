package MatteoOrlando.U5D1.entites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class Menu {


    private List<Pizza> pizze;


    private List<Bevanda> bevande;


    @Autowired
    public Menu(List<Pizza> pizze, List<Bevanda> bevande) {
        this.pizze = pizze;
        this.bevande = bevande;
    }


    public void printMenu() {
        System.out.println("Pizze disponibili:");
        for (Pizza pizza : pizze) {
            System.out.println(pizza.getNome() + " - Prezzo: " + pizza.getPrezziBase());
            for (Aggiunta aggiunta : pizza.getAggiunta()) {
                System.out.println("    + " + aggiunta.getNome() + " - Prezzo aggiuntivo: " + aggiunta.getPrezzo());
            }
        }
        System.out.println("\nBevande disponibili:");
        for (Bevanda bevanda : bevande) {
            System.out.println(bevanda.getNome() + " - Prezzo: " + bevanda.getPrezzo());
        }
    }

    //GOOGLE//
//    private List<Aggiunta> parseAggiunte(String aggiunteString) {
//        List<Aggiunta> aggiunte = new ArrayList<>();
//
//        String[] aggiunteArray = aggiunteString.split(",");
//
//        for (String aggiunta : aggiunteArray) {
//            aggiunte.add(new Aggiunta(aggiunta.trim()));
//        }
//        return aggiunte;
//    }
}

