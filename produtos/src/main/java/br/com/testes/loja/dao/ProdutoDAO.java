package br.com.testes.loja.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import br.com.testes.loja.modelo.Produto;

public class ProdutoDAO {
	
	private static List<Produto> lista = new ArrayList<Produto>();
	
	private static Map<Long, Produto> produtos = new HashMap<Long, Produto>();
	private static AtomicLong contador = new AtomicLong(1);
	
	static {
		
		Produto produto1 = new Produto(1, "Jogo eletrônico", "Videogame" , 30.10);
		Produto produto2 = new Produto(2, "Jogo no campo", "Futebol", 10);
		lista.add(produto1);
		lista.add(produto2);
		
		produtos.put(1l, produto1);
		produtos.put(2l, produto2);
	}
	
	
	public void adiciona(Produto produto) {
//		long id = contador.incrementAndGet();
//		produtos.put(id, produto);
		lista.add(produto);
	}
	
	public List<Produto> lista(){
		return lista;
	}
	
	public Produto busca(int posicao) {
		return lista.get(posicao);
		//return produtos.get(id);
	}

}
