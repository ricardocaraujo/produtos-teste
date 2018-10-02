package br.com.testes.loja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.testes.loja.dao.ProdutoDAO;
import br.com.testes.loja.modelo.Produto;

@Controller
public class HomeController {
	
	@RequestMapping("/teste")
	public String olaMundo() {
		System.out.println("ola");
		return "ok";
	}
	
	@RequestMapping("/adicionaProduto")
	public String adiciona(@Valid Produto produto) {
		ProdutoDAO dao = new ProdutoDAO();
		Produto produto1 = dao.busca(1l);
		System.out.println(produto1.getNome());
		dao.adiciona(produto);
		return "ok";
	}

}
