package com.kernotec.test.client;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    private final ClientRepository clientRepository;
    
    HashMap<String, Object> data;
        
    @Autowired
    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients(){
        return this.clientRepository.findAll();
    }

    public ResponseEntity<Object> newClient(Client client) {
        data = new HashMap<>();
        Optional<Client> res = clientRepository.findClientByNombre(client.getNombre());
        System.out.println(res.isPresent());
        if(res.isPresent() && client.getIdCliente() == null){
            data.put("error", true);
            data.put("message","Ya existe un cliente con ese nombre");            
            return new ResponseEntity<>(
                data,
                HttpStatus.CONFLICT
            );
        }
        data.put("message","Se guardó con exito");            
        if(client.getIdCliente() != null )
            data.put("message","Se actualizó con exito");            
        clientRepository.save(client);
        data.put("data", client);
        return new ResponseEntity<>(
                data,
                HttpStatus.CREATED
            );
    }

    public ResponseEntity deleteClient(Long id){
        data = new HashMap<>();
        boolean existe = this.clientRepository.existsById(id);
        if(!existe){
            data.put("error", true);
            data.put("message","No existe un cliente con ese id");            
            return new ResponseEntity<>(
                data,
                HttpStatus.CONFLICT
            );
        }
        clientRepository.deleteById(id);
            data.put("message","Cliente eliminado");            
            return new ResponseEntity<>(
                data,
                HttpStatus.ACCEPTED
            );
        
    }

}
