package com.mensagem.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.mensagem.model.Carro;

@Component
public class CarroReceiver {

	@JmsListener(destination="carroReceiver", containerFactory="myFactory")
	public void receiveMessage(Carro carro){
		System.out.println(String.format("Carro: %s da marca: %s", carro.getNome(), carro.getCor()));
	}
	
}
