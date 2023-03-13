package com.crud.promacaoWeb.core.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UsuarioDTO {

	@NotBlank
	private String nome;
	
	@NotBlank
	private String email;
	
	@NotNull
	@Positive(message = "idade inválida!")
	private int age;
	
}
