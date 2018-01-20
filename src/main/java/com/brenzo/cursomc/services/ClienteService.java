package com.brenzo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenzo.cursomc.domain.Cliente;
import com.brenzo.cursomc.repositories.ClienteRepository;
import com.brenzo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado id: " + id + " e tipo: " + Cliente.class.getName());
		}
		return obj;
	}
}
