package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Client;
import org.sid.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}
	
	public Optional<Client> getClientById(Long id) {
		return clientRepository.findById(id);
	}
	
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}
	
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}
	
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

}
