package com.cibertec.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.Cliente;
import com.cibertec.app.repository.CategoriaRepository;
import com.cibertec.app.repository.ClienteRepository;
import com.cibertec.app.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
@Autowired
ClienteRepository clienteRepository;

@Override
public Cliente saveCliente(Cliente userEntity) {
	// TODO Auto-generated method stub
	return clienteRepository.save(userEntity);
}

@Override
public List<Cliente> getCliente() {
	// TODO Auto-generated method stub
	return clienteRepository.findAll();
}

@Override
public Cliente updateCliente(Cliente UserEntity) {
	// TODO Auto-generated method stub
	return clienteRepository.save(UserEntity);
}

@Override
public void deleteCliente(Integer id) {
	// TODO Auto-generated method stub
	clienteRepository.deleteById(id);
}

@Override
public Cliente findClienteById(Integer id) {
	// TODO Auto-generated method stub
	return clienteRepository.findById(id).get();
}


}
