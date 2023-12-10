package ecommerce.feedback.DAO.Proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.Path;

@FeignClient(name = "Produit-Service", path = "produit")
public interface ProduitProxy {

    @GetMapping("/search/{name}")
    public String getName(@PathVariable("name") String name);
}
