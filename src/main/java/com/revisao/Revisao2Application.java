package com.revisao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revisao.entities.User;
import com.revisao.repositories.UserRepository;

@SpringBootApplication
public class Revisao2Application implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(Revisao2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Clarinha", "clarinha@email.com");
		User u2 = new User(null, "Bebel", "bebel@email.com");
		User u3 = new User(null, "Nala", "nala@email.com");
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		
		
//		Order o1 = new Order(null, Instant.parse("2022-02-01T12:23:23Z"), u1);
//		Order o2 = new Order(null, Instant.parse("2022-02-03T10:12:11Z"), u1);
//		Order o3 = new Order(null, Instant.parse("2022-02-05T22:54:09Z"), u3);
//		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}
