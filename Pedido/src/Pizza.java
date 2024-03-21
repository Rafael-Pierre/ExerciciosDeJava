import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Pizza implements List<Pizza> {
	public static List<String> listIngredientes;
	public static int quantidadeIngredientes;
	public static double preco;
	
	public Pizza(){
		this.listIngredientes = new ArrayList<>();
		this.quantidadeIngredientes = 0;
		this.preco = 0;
	} 

	public static int getQuantidadeIngredientes() {
		return quantidadeIngredientes;
	}

	public static void setQuantidadeIngredientes(int quantidadeIngredientes) {
		Pizza.quantidadeIngredientes = quantidadeIngredientes;
	}
	
	public static Boolean verificaQuantidade() {
		
		if(quantidadeIngredientes < 8 ) {
			return true;
		}
		else
			return false;
	}
	
	public static Boolean verificaIngrediente(String ingrediente) {
		
		for(String ingred : listIngredientes) {
			if(ingred == ingrediente || ingred == "queijo" || ingred == "peperoni") {
				return false;
			}
		}
		
		return true;
	}
	
	public static void addIngrediente(String ingrediente) {
		
		if(verificaQuantidade()) {
			if(verificaIngrediente(ingrediente)) {				
				listIngredientes.add(ingrediente);
				quantidadeIngredientes++;
			}
			
		}
			
	}
	public static void removeIngrediente(String ingrediente) {
		listIngredientes.remove(ingrediente);
		quantidadeIngredientes--;
		if(quantidadeIngredientes < 0) {
			quantidadeIngredientes = 0;
		}
		
	}
	
	public static double geraPreco() {
		
		double precoAdicional = 4.00 * listIngredientes.size();
		
		preco = 25.00 + precoAdicional;
		
		return preco;
		
	}
	
	public static void geraNota() {
		
		double precoPizza = geraPreco();
		System.out.println("---------- Nota fiscal -----------");
		System.out.println("----- Voce comprou uma pizza -----");
		System.out.println("----- preco: " + precoPizza);
		System.out.println("----- Ingredientes: ");
		System.out.println("--- queijo");
		System.out.println("--- peperoni");
		for(String ingred : listIngredientes){
			System.out.println("--- " + ingred);
		}
	}

	public static void main(String[] args){
		
		Pizza a = new Pizza();
		
		a.addIngrediente("aaa");
		a.addIngrediente("b");
		a.addIngrediente("c");
		a.addIngrediente("d");
		a.addIngrediente("e");
		a.addIngrediente("f");
		a.addIngrediente("g");
		a.addIngrediente("g");
		a.addIngrediente("g");
		a.addIngrediente("g");
		
		a.removeIngrediente("ze");
		a.geraNota();
	}

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator<Pizza> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean add(Pizza e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends Pizza> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends Pizza> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public Pizza get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public Pizza set(int index, Pizza element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, Pizza element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Pizza remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<Pizza> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<Pizza> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<Pizza> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }


}
