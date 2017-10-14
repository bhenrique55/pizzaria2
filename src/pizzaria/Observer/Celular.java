package pizzaria.Observer;

public class Celular implements Observador {

    @Override
    public void notificar() {
        System.out.println("SMS enviado");
    }
    
}