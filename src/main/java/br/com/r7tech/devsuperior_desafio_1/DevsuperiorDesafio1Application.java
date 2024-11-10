package br.com.r7tech.devsuperior_desafio_1;

import br.com.r7tech.devsuperior_desafio_1.entities.Order;
import br.com.r7tech.devsuperior_desafio_1.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DevsuperiorDesafio1Application implements CommandLineRunner {

	private final OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DevsuperiorDesafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order();

		// Exemplo 1
		//order.setCode(1034);
		//order.setBasic(150.0);
		//order.setDiscount(20.0);

		// Exemplo 2
		//order.setCode(2282);
		//order.setBasic(800.0);
		//order.setDiscount(10.0);

		// Exemplo 3
		order.setCode(1309);
		order.setBasic(95.9);
		order.setDiscount(0.0);

		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
	}
}
