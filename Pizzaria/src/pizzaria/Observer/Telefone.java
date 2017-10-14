package pizzaria.Observer;

public class Telefone implements Observador{
    
    @Override   
    public void notificar(){
        System.out.println("Cliente notificado via Telefone");
    }    
}
