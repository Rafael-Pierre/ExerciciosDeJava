import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PedidoTest {

    private Pedido pedido;
    private Pizza pizza1;
    private Pizza pizza2;
    
    @Before
    public void setUp() {
        pedido = new Pedido();
        pizza1 = new Pizza("Mussarela", "Molho de tomate, mussarela", 25.0);
        pizza2 = new Pizza("Calabresa", "Molho de tomate, calabresa, cebola", 30.0);
    }

    @Test
    public void testAdicionaPizza() {
        pedido.adicionaPizza(pizza1);
        assertEquals(1, pedido.getPizzas().size());
        assertEquals(25.0, pedido.getPrecoTotal(), 0.0);
        
        pedido.adicionaPizza(pizza2);
        assertEquals(2, pedido.getPizzas().size());
        assertEquals(55.0, pedido.getPrecoTotal(), 0.0);
        
        for (int i = 0; i < 10; i++) {
            Pizza pizza = new Pizza("Pizza " + i, "Molho de tomate, queijo", 20.0);
            pedido.adicionaPizza(pizza);
        }
        Pizza pizza11 = new Pizza("Pizza 11", "Molho de tomate, queijo", 20.0);
        pedido.adicionaPizza(pizza11);
        assertEquals(10, pedido.getPizzas().size());
    }
    
    @Test
    public void testGeraNota() {
        pedido.adicionaPizza(pizza1);
        pedido.adicionaPizza(pizza2);
        pedido.geraNota();
        
    }
    
    @Test
    public void testPedidoDuplicado() {
        pedido.adicionaPizza(pizza1);
        pedido.adicionaPizza(pizza2);
        assertFalse(pedido.pedidoDuplicado(1234));
        pedido.setNumeroPedido(1234);
        assertTrue(pedido.pedidoDuplicado(1234));
    }
    
}
