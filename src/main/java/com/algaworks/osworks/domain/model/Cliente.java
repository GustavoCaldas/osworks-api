package com.algaworks.osworks.domain.model;

import javax.persistence.Column;
// import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor 
@EqualsAndHashCode(of = {"id"})
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
	@Getter @Setter private String nome;
	@Getter @Setter private String email;
	
	// @Column(name = "telefone")
	@Getter @Setter private String telefone;
	
}
