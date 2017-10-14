package pizzaria.Observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String pedido;
    private List<Observador> observadores = new ArrayList<>();
    
    public void setPedido(String pedido){
        this.pedido = pedido;
        for(Observador observador:observadores){
            observador.notificar();
        }
    }
    public void addObservador(Observador novo){
        this.observadores.add(novo);
    }
}
