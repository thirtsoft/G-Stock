package org.sid.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "categorie")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Categorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idCategorie;
	private String codeCategorie;
	private String catgorieName;
	
	@OneToMany(mappedBy = "categorie")
	@JsonProperty(access = Access.WRITE_ONLY) // Prmt d'éviter la lecture en boucle infini comme on bidirectional
	private Collection<Article> articles;
	

}
