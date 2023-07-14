package estudoJavaFuncionalFunction.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import estudoJavaFuncionalFunction.entidade.Produto;
import estudoJavaFuncionalFunction.util.LowerCaseNome;

public class Programa {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto(1, "TV", 900.00));
		lista.add(new Produto(2, "PC", 50.00));
		lista.add(new Produto(3, "CELULAR", 350.00));
		lista.add(new Produto(4, "NOTBOOK", 3000.00));
		lista.add(new Produto(5, "CARREGADOR", 80.00));

		// Primeira Forma
		List<String> lower = lista.stream().map(new LowerCaseNome()).collect(Collectors.toList());

		lower.forEach(System.out::println);
		
		System.out.println();

		// Segunda Forma
		List<String> lower2 = lista.stream().map(Produto::staticToLowerCase).collect(Collectors.toList());

		lower2.forEach(System.out::println);
		
		System.out.println();
		
		// Terceira Forma
		List<String> lower3 = lista.stream().map(Produto::naoStaticToLowerCase).collect(Collectors.toList());

		lower3.forEach(System.out::println);
		
		System.out.println();

		// Quarta Forma
		Function<Produto, String> auxFunc = p -> p.getNome().toLowerCase();
		
		List<String> lower4 = lista.stream().map(auxFunc).collect(Collectors.toList());

		lower4.forEach(System.out::println);
		
		System.out.println();
		
		// Quinta Forma
		List<String> lower5 = lista.stream().map(p -> p.getNome().toLowerCase()).collect(Collectors.toList());

		lower5.forEach(System.out::println);
		
		System.out.println();
	}

}
