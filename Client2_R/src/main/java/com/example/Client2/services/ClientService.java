package com.example.Client2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Client2.entities.Client;
import com.example.Client2.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> findAll(){
		return clientRepository.findAll();
	}
	
	public Client FindById(Long id) throws Exception{
		return clientRepository.findById(id).orElseThrow(()-> new Exception("Invalid Client ID"));
	}
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}
	
}
