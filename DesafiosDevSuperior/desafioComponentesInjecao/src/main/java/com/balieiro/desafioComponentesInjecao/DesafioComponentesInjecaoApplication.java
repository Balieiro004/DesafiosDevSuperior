package com.balieiro.desafioComponentesInjecao;

import com.balieiro.desafioComponentesInjecao.entities.Order;
import com.balieiro.desafioComponentesInjecao.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class DesafioComponentesInjecaoApplication implements CommandLineRunner {

	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesInjecaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 800d, 10d);


		System.out.println("Pedido código: " + order.getCod());
		System.out.println("Valor total: " + orderService.total(order));
	}
}
