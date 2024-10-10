package com.cibertec.app.service;

import java.util.List;

import com.cibertec.app.entity.Cliente;

public interface ClienteService {
	public Cliente saveCliente(Cliente userEntity);
	public List<Cliente> getCliente();
	public Cliente updateCliente(Cliente UserEntity);
	public void deleteCliente(Integer id);
	public Cliente findClienteById(Integer id);
}
