package pizzaria.Template;

public class RelatorioVendaTotal extends Relatorio {
    
    public void tipoRelatorio(){
        System.out.println("Relatorio do total vendido "+ String.valueOf(precototal));
    }
}
