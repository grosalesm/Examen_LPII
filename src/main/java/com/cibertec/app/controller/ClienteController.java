package com.cibertec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.app.entity.Cliente;
import com.cibertec.app.service.ClienteService;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class ClienteController {
@Autowired
private ClienteService service;

@GetMapping("/cliente")
public String listClientes(Model model) {
	model.addAttribute("clientes", service.getCliente());
	return "cliente/index";
}

@GetMapping("/cliente/new")
public String createClienteForm(Model model) {
	//este objeto Cliente Almacenara los valores
	Cliente cliente = new Cliente();
	model.addAttribute("cliente",cliente);
	return "cliente/create";
}

@PostMapping("/cliente")
public String saveCliente(@ModelAttribute("cliente") Cliente cliente) {
	service.saveCliente(cliente);
	return "redirect:/cliente";
}

@GetMapping("/cliente/edit/{id}")
public String editClienteForm(@PathVariable Integer id, Model model) {
	Cliente st = service.findClienteById(id);
	model.addAttribute("cliente", st);
	return "cliente/edit";
}

@PostMapping("/cliente/{id}")
public String updateCliente(@PathVariable Integer id, @ModelAttribute("cliente") Cliente cliente, Model model) {
	//sacar el estudiante de la b.d. por el id
	Cliente existentCliente = service.findClienteById(id);
	//cargarlo
	existentCliente.setIdClie(id);
	existentCliente.setRazonSoc(cliente.getRazonSoc());
	existentCliente.setNombreCiudad(cliente.getNombreCiudad());
	existentCliente.setDireccionClie(cliente.getDireccionClie());
	existentCliente.setTelefono(cliente.getTelefono());
	//guardar el estudiante actualizado
	service.updateCliente(existentCliente);
	return "redirect:/cliente";
}
@GetMapping("/cliente/{id}")
public String deleteCliente(@PathVariable Integer id) {
	service.deleteCliente(id);
	return "redirect:/cliente";
}


}
