package org.sid.entites;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name="article")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Article implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idArticle;
	private String codeArticle;
	private String articleName;
	private int quantite;
	private BigDecimal prixUnitaire;
	private String photoArticle;
	
	@ManyToOne
	private Categorie categorie;

}
