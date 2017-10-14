# Projeto Pizzaria

# DECORATOR

 Adiciona comportamentos aos componentes bases.
 
 **Classes BordaCatupiry, BordaCheddar, PizzaCalabresa - ** Comportamentos que podem  ser adicionados (itens adicionais que podem ser adicionados)
 
 **Classe Ingrediente - ** Cria os comportamentos
 
 **Classe Pizza - ** Objeto que será decorado
 
 # OBSERVER
 
 Permitir que obejeto seja notificado caso ocorra alterações em outros obejetos.
 
 **Classes Celular, Telefone - ** Observadores a serem notificados
 
 **Classe Pedido - ** Adiciona os observadores
 
 **Interface Observador - ** Implementa o método que notificará as classes
 
 # STATE
 
 Altera o estado de um objeto e seu comportamento também é alterado.
 
 **Classes EmProducao, Pronto - ** Estados que a pizza poderá assumir
 
 **Interface EstadoDoPedido - ** Implementa o estado que a classe Pizza assumirá (O estado será EmProducao ou Pronto)
 
 # TEMPLATE
 
 Sequencia de passos definidos, onde classes filhas podem ter comportamento diferente.
 
 **Classe Relatorio - ** Método que pode gerar dois tipos de relatórios diferentes
 
 **Classes RelatorioVendaDeItens - ** Gera um relatório de todos itens vendidos
 
 **Classes RelatorioVendaTotal - ** Gerar um relatório com o valor total de todos itens vendidos
 
