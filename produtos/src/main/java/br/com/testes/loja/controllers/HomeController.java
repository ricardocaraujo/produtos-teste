package br.com.testes.loja.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public String adiciona(@Valid Produto produto, BindingResult result) {
		if(result.hasFieldErrors("nome")) {
			return "teste";
		}
		ProdutoDAO dao = new ProdutoDAO();
		dao.adiciona(produto);
		return "ok";
	}
	
	@RequestMapping("/listaProdutos")
	public ModelAndView lista() {
		List<Produto> lista = new ProdutoDAO().lista();
		ModelAndView mv = new ModelAndView("lista");
		mv.addObject("produtos", lista);
		return mv;
	}

}
