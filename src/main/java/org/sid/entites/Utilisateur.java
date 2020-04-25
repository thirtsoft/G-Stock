package org.sid.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "utilisateur")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Utilisateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String lastname;
	private String firstnam;
	@Column(unique = true)
	private String username;
	private String password;
	private boolean actived;
	private String photoUtilisateur;
	@ManyToMany
	(fetch=FetchType.EAGER)// permet d'affecter un role pour chaque user à enregistrer
	private Collection<Role> roles = new ArrayList<>();

}
