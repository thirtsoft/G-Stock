package org.sid.entites;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "inventaire")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Inventaire implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idInventaire;
	private String codeInventaire;
	private Date dateInventaire;
	private Double chiffre_Depart;
	private Double chiffre_Affaire;
	
	@ManyToOne
	private Boutique boutique;

}
