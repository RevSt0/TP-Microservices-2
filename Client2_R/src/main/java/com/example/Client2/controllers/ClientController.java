package com.example.Client2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Client2.entities.Client;
import com.example.Client2.services.ClientService;

@RestController
@RequestMapping("api/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public List<Client> findAll(){
		return clientService.findAll();
	}
	
	@GetMapping("/{id}")
	public Client findById(@PathVariable Long id) throws Exception{
		return clientService.FindById(id);
	}
	
	@PostMapping
	public void save(@RequestBody Client client) {
		clientService.addClient(client);
	}

}
