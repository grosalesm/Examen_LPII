package com.cibertec.app.service;

import java.util.List;

import com.cibertec.app.entity.Producto;
public interface ProductoService {
public Producto saveProducto(Producto userEntity);
public List<Producto> getAllProducto();
public Producto updateProducto(Producto userEntity);
public void deleteProductoById(Integer idProd);
public Producto findProductoById(Integer idProd);

}
