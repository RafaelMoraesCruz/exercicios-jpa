package teste.basics;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basics.Produto;

public class ObterProdutos {

	public static void main(String[] args) {

		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		dao.obterTodos().stream().forEach(System.out::println);
		
//		for (Produto produto: produtos) {
//			System.out.println(produto);
//		}
//		
//		double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (t,p) -> t + p).doubleValue();
//		System.out.println("o valor total é: " +precoTotal);

	}

}
