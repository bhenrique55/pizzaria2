package pizzaria;

import pizzaria.Decorator.BordaCatupiry;
import pizzaria.Decorator.Pizza;
import pizzaria.Decorator.PizzaCalabresa;
import pizzaria.Observer.Celular;
import pizzaria.Observer.Pedido;
import pizzaria.State.EstadoDoPedido;
import pizzaria.State.Pronto;
import pizzaria.Template.Relatorio;
import pizzaria.Template.RelatorioVendaDeItens;
import pizzaria.Template.RelatorioVendaTotal;

public class Pizzaria {

    public static void main(String[] args) throws InterruptedException {

        //Decorator
        Pizza pizzaCalabresa = new PizzaCalabresa();
        pizzaCalabresa = new BordaCatupiry(pizzaCalabresa);
        System.out.println("Pedido: " + pizzaCalabresa.getDescricao());
        System.out.println("Valor Total: " + pizzaCalabresa.getPreco());

        //State
        PizzaCalabresa calabresa = new PizzaCalabresa();
        calabresa.preparo();
        Thread.sleep(5000);
        //Observer    
        calabresa.setPreparo(new Pronto());
        calabresa.preparo();

        Pedido pedidofinalizado = new Pedido();
        pedidofinalizado.addObservador(new Celular());
        pedidofinalizado.setPedido("Novo Pedido");

        //Template
        Thread.sleep(5000);
        Relatorio r = new RelatorioVendaDeItens();
        r.setPedido(pizzaCalabresa);
        r.gerarRelatorio();
        Thread.sleep(5000);
        Relatorio o = new RelatorioVendaTotal();
        o.setPedido(pizzaCalabresa);
        o.gerarRelatorio();

    }

}
