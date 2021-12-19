package code.quarkus.io.comercio.resource;


import code.quarkus.io.comercio.entidade.Produto;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/produtos")
public class ProdutosResource {


    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Produto> getProdutos(){
       Produto produto = new Produto();
       List<Produto> allProdutos = Produto.listAll();

       return allProdutos;
    }
}
