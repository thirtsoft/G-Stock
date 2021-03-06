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
@Table(name = "versement")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Versement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idVersement;
	private String codeVersement;
	private Double montantVersement;
	private String factureVersment;
	private Date dateVersement;
	
	@ManyToOne
	private Boutique boutique;
	
	@ManyToOne
	private Employee employee;
	

}
