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
@Table(name = "retour_Client")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class RetourClient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idCategorie;
	private String codeCategorie;
	private String catgorieName;
	
	@ManyToOne
	private Article article;
	

}
