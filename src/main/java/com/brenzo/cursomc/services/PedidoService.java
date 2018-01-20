package com.brenzo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenzo.cursomc.domain.Pedido;
import com.brenzo.cursomc.repositories.PedidoRepository;
import com.brenzo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado id: " + id + " e tipo: " + Pedido.class.getName());
		}
		return obj;
	}
}
