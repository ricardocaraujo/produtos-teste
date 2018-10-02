package br.com.testes.loja.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.testes.loja.modelo.Produto;

public class ProdutoDAO {
	
	private static Map<Long, Produto> produtos = new HashMap<Long, Produto>();
	private static AtomicLong contador = new AtomicLong(1);
	
	static {
		
		Produto produto1 = new Produto("Jogo eletrônico", "Videogame" , 30.10);
		Produto produto2 = new Produto("Jogo no campo", "Futebol", 10);
		produtos.put(1l, produto1);
		produtos.put(2l, produto2);
	}
	
	
	public void adiciona(Produto produto) {
		long id = contador.incrementAndGet();
		produtos.put(id, produto);
	}
	
	public Produto busca(Long id) {
		return produtos.get(id);
	}

}
