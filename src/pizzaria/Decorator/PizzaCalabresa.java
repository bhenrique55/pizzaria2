package pizzaria.Decorator;

import pizzaria.State.EmProducao;
import pizzaria.State.EstadoDoPedido;

public class PizzaCalabresa extends Pizza {

    @Override
    public String getDescricao() {
        return "PizzaCalabresa";
    }

    @Override
    public Double getPreco() {
        return 35.00;
    }
    
    //State
    private EstadoDoPedido preparo;
    
    public PizzaCalabresa(){
        this.preparo = new EmProducao();
    }

    public void setPreparo(EstadoDoPedido novo) {
        this.preparo = novo;
    }
    
    public void preparo(){
        preparo.estado();
    }
    
    
    
}
