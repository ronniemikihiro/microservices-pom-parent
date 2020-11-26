package br.com.esales.rest.product;

import br.com.esales.enterprise.entity.Product;
import br.com.esales.enterprise.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Collection;
import java.util.Optional;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories({"br.com.esales.enterprise.repository"})
@EntityScan({"br.com.esales.enterprise.entity"})
@ComponentScan("br.com.esales")
public class RestProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestProductApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ProductRepository productRepository) {
		return args -> {
			initUsers(productRepository);
		};
	}

	private void initUsers(ProductRepository productRepository) {
		final Optional<Product> optionalProduct = productRepository.findById(1L);

		if(optionalProduct.isEmpty()) {
			final Product product = Product.builder()
					.name("Product Example")
					.build();

			productRepository.save(product);
		}

		Product product = null;
		final Iterable<Product> itProducts = productRepository.findAll();

		if(((Collection<?>) itProducts).size() < 30) {
			for(long i=2; i<=30; i++) {
				product = Product.builder()
						.name("Product Example " + i)
						.build();

				productRepository.save(product);
			}
		}
	}

}
