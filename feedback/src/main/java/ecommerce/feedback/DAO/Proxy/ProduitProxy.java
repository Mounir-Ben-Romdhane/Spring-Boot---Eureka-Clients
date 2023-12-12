package ecommerce.feedback.DAO.Proxy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.Path;


public interface ProduitProxy {

    @GetMapping("/search/{name}")
    public String getName(@PathVariable("name") String name);
}
