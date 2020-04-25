package org.sid.entites;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "fournisseur")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Fournisseur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFournisseur;
	private String cni;
	private String nameFournisseur;
	private String prenomFournisseur;
	private String adresseFournisseur;
	private String telephoneFournisseur;
	private String emailFournisseur;
	//private String photoFournisseur;
	
	@OneToMany(mappedBy = "fournisseur")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<CommandeFournisseur> commandeFournisseurs;

}
