package com.curso.ecomerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecomerce.model.Producto;
import com.curso.ecomerce.repository.ProductoRepository;

@Service
public class ProductoServiceImpl  implements ProductoService{

	@Autowired
	private ProductoRepository productorepository;
	
	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productorepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return productorepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		 productorepository.save(producto);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productorepository.deleteById(id);
		
	}

}
