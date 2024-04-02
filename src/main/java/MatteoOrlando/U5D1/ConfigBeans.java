package MatteoOrlando.U5D1;
import MatteoOrlando.U5D1.entites.Aggiunta;
import MatteoOrlando.U5D1.entites.Bevanda;
import MatteoOrlando.U5D1.entites.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ConfigBeans {

    @Bean
    public Pizza mergherita(){
        Pizza pizza = new Pizza("Margherita", 4.0);
        pizza.setAggiunta(Arrays.asList(new Aggiunta("Prosciutto", 1.0, "Valore energetico - Calorie Prosciutto 138 kcal / 576 kj (100gr)")));
        return pizza;
    }

    @Bean
    public Pizza hawaiian(){
        Pizza pizza = new Pizza("La Immangiabile", 22.0);
        pizza.setAggiunta(Arrays.asList(new Aggiunta("Prosciutto", 1.0, "Valore energetico - Calorie Prosciutto 138 kcal / 576 kj (100gr)"),
                                        new Aggiunta("Ananas", "Valore energetico - Calorie Ananas fresco 40 kcal / 165 kj (100gr)")));
        return pizza;
    }

    @Bean
    public Bevanda cola(){
        return new Bevanda("Pepsi", 1.5, "Valore energetico - Calorie Bevanda tipo cola 39 kcal / 165 kj");
    }

}
