import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Pedido{

    private static List<Pizza> pizzas;
    private static Integer numeroPedido;
    private static List<Integer> numerosPedidos = new ArrayList<Integer>();
    private static List<Double> precos;

    /**
        Verifica se um número de pedido já foi usado anteriormente.
        @param numeroPedidoAtual O número de pedido a ser verificado
        @return true se o número de pedido já foi usado antes, false caso contrário
    */
    private Pedido(int numeroPedidoAtual){
        
        for(int numPedido : numerosPedidos){
            if(numeroPedidoAtual == numPedido){
                throw new InvalidParameterException("Este numero de pedido ja existe");
            }
        }

        this.numerosPedidos.add(numeroPedidoAtual);
        this.precos = = new ArrayList<Double>();
        this.pizzas = new ArrayList<Pizza>();
    }

    /**
        Adiciona uma pizza ao pedido.
        @param pizza A pizza a ser adicionada ao pedido
    */
    public void adicionaPizza(Pizza pizza){
        if(this.pizzas.size() > 10){
            this.pizzas.add(pizza);

            double preco = pizza.geraPreco();
            this.precos.add(preco);
        }

    }

    /**
        Adiciona uma pizza ao pedido.
        @param pizza A pizza a ser adicionada ao pedido
    */
    public double getPrecoTotal(){
        double precoTotal=0;

        for(double preco : precos){
            precoTotal += preco;
        }

        return precoTotal;
    }

    /**
        Método que gera uma nota para o pedido realizado, exibindo o número do pedido,
        os itens selecionados, seus respectivos preços e o valor total do pedido.
        @return void
    */
    public void geraNota(){

        System.out.println("Voce fez um pedido!");
        System.out.println("Pedido: " + numeroPedido);
        System.out.println("Itens Selecionados:");

        for(int i = 0 ; i <= this.pizzas.size() ; i++  ){
            System.out.println("Pizza: " + this.pizzas.get(i));
            System.out.println("Valor: " + this.precos.get(i));
            System.out.println();
        }

        double precoTotal = getPrecoTotal();
        System.out.println("Valor total do pedido: " + precoTotal);
    }

}