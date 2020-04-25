package org.sid.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "depense")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Depense implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idDepense;
	private String nature;
	private int quantite;
	private Double montantDepense;
	
	@ManyToOne
	private Boutique boutique;
	

}
