package org.sid.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "commande_client")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class CommandeClient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCmdClient;
	private String codeCmdClient;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCmdClient;
	
	private String etatCmdClient;
	
// pr montrer k1e commande concerne un client
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient")
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<LigneCommandeClient> ligneCommandeClients;

}
