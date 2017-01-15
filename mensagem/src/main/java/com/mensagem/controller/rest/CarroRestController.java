package com.mensagem.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mensagem.model.Carro;

@RestController
@RequestMapping("/carros")
public class CarroRestController {
	
	@Autowired
	private JmsTemplate jmsTemplate;

	@GetMapping
	public String sendCarro(@RequestParam("nome") String nome, @RequestParam("cor") String cor) {
		this.jmsTemplate.convertAndSend("carroReceiver", new Carro("Gol", "Branco"));
		return "Os dados foram enviados para o Recepitor de menssagem carroReceiver"; 

	}
}
