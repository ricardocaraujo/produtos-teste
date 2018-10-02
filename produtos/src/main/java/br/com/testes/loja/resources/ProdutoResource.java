package br.com.testes.loja.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("produtos")
public class ProdutoResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String busca() {
		return "<pastadente>colgate</pastadente>";
	}
	
	
}
