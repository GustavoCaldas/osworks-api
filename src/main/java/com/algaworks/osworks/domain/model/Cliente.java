package com.algaworks.osworks.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Cliente {
	
	@Getter @Setter private Long id;
	@Getter @Setter private String nome;
	@Getter @Setter private String email;
	@Getter @Setter private String telefone;
	
}
