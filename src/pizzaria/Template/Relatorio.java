package pizzaria.Template;

import pizzaria.Decorator.Pizza;

public abstract class Relatorio {
    protected Pizza produto;
    protected Double precototal;
    public void gerarRelatorio(){
        buscar();
        calcular();
        exportar();
        tipoRelatorio();
    }
    
    protected abstract void tipoRelatorio();
    
    private void buscar(){
        System.out.println("Buscar...");
    }
    
    private void calcular(){
        System.out.println("Calculando...");
        precototal = produto.getPreco();
    }
    
   private void exportar(){
       System.out.println("Exportando...");
   }

    public void setPedido(Pizza pizza) {
        produto  = pizza;
    }
   
   
}
