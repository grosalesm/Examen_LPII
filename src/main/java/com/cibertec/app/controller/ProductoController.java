package com.cibertec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cibertec.app.entity.Producto;
import com.cibertec.app.service.CategoriaService;
import com.cibertec.app.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService prodService;
	
	@Autowired
	private CategoriaService catService;
	
	@GetMapping("/producto")
	public String listProductos(Model model) {
		model.addAttribute("productos",prodService.getAllProducto());
		return "producto/index";
	}
	
	@GetMapping("/producto/new")
	public String createProductoForm(Model model) {
		Producto producto = new Producto();
		model.addAttribute("producto",producto);
		model.addAttribute("categoriaList", catService.getAllCategoria());
		return "producto/create";
	}
	
	@PostMapping("/producto")
	public String saveProducto(@ModelAttribute("producto") Producto producto) {
		prodService.saveProducto(producto);
		return "redirect:/producto";
	}
	
	@GetMapping("/producto/edit/{id}")
	public String editProductoForm(@PathVariable Integer id, Model model) {
		Producto prod = prodService.findProductoById(id);
		model.addAttribute("producto", prod);
		model.addAttribute("categoriaList", catService.getAllCategoria());
		return "producto/edit";
	}	
}