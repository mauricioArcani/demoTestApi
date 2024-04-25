package com.kernotec.test.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(path = "api/v1/clients")
public class ClientController {
    
    private final ClientService clientService;

	@Autowired
	public ClientController(ClientService clientService){
		this.clientService = clientService;
	}

	@GetMapping
	public List<Client> getClients() {
		return this.clientService.getClients();
	}

	@PostMapping
	public ResponseEntity<Object> registryClient(@RequestBody Client client) {
		return this.clientService.newClient(client);
	}

	@PutMapping
	public ResponseEntity<Object> updateClient(@RequestBody Client client) {
		return this.clientService.newClient(client);
	}

	@DeleteMapping(path = "{idCliente}")
	public ResponseEntity<Object> deleteClient( @PathVariable("idCliente") Long id){
		return this.clientService.deleteClient(id);
	}
	
	
}
