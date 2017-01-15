package com.mensagem.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Carro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String nome;
	private final String cor;


}
