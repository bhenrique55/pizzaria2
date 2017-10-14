package pizzaria.Decorator;

public abstract class Ingrediente extends Pizza {
    protected Pizza pizza;
    protected String descricao;
    protected Double preco;
    
    public Ingrediente(Pizza pizza, String descricao, Double preco){
        this.pizza = pizza;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public String getDescricao(){
        return pizza.getDescricao() + " + " + descricao ;
    }
    
    @Override
    public Double getPreco(){
        return preco + pizza.getPreco();
    }
    
}
