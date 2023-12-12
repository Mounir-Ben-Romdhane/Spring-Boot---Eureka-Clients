package tn.esprit.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        //System.out.println("hello");
        return builder.routes()

                .route("FeedbackMicroService", r -> r.path("/feedback/**")
                        .uri("lb://FeedBack-Service/**"))
                .route("CurrencyMicroService", r -> r.path("/Currency/**")
                        .uri("lb://currency/**"))
                .route("ReclamationMicroService", r -> r.path("/Reclamation/**")
                        .uri("lb://reclamation-service/**"))
                .route("ProductMicroService", r -> r.path("/produit/**")
                        .uri("lb://product-service/**"))
                .route("BlogMicroService", r -> r.path("/blog/**")
                        .uri("lb://blogService/**"))
                .route("CategoryMicroService", r -> r.path("/category/**")
                        .uri("lb://category/**"))
                .build();
    }
}