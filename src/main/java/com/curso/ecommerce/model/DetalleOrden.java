package com.curso.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="detalles")
public class DetalleOrden {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private  Integer id;
	private String numero;
	private double cantidad;
	private double precio;
	private double total;
	
	@OneToOne
	private Orden orden;
	
	@ManyToOne
	private Producto producto;
	
	public DetalleOrden() {
		
	}
	public DetalleOrden(Integer id, String numero, double cantidad, double precio, double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public Orden getOrden() {
		return orden;
	}
	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	@Override
	public String toString() {
		return "DetalleOrden [id=" + id + ", numero=" + numero + ", cantidad=" + cantidad + ", precio=" + precio
				+ ", total=" + total + "]";
	}
	
	
}
