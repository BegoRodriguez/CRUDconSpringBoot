package com.example.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/** POJO (Plain Old Java Objet) para gestionar los productos en la aplicacion
 * @author brodf */

@Entity
@Table(name = "productos")
public class Producto {

    /**
     * Campo autoincremental entero en nuestra base de datos
     */

    @Column(name = "producto_id") private int producto_id;
    @Column(name = "nombre") private String nombre;
    @Column(name = "precio") private double precio;
    @Column(name = "categoria") private String categoria;
    @Column(name = "unidades") private int unidades;
    @Column(name = "id_proveedor") private int id_proveedor;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getProducto_id() {
        return producto_id;
    }
 
    /*@ManyToMany(mappedBy = "productos")  // Como se llame el atributo en la clase que asociemos
    private List<Cliente> clientes = new ArrayList<>();

    /* Un proveedor tendrá varios productos así que aquí tenemos un único proveedor */
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proveedor") // Como se llame en la tabla de productos
    private Proveedor proveedor;*/
    /* Necesitamos este constructor para leer */


    /* Constructor vacío necesario para realizar consultas en Hibernate */
    public Producto(){}


    /*public void addCliente(Cliente cliente) {
        //producto.addCliente(this); // En el producto añadimos a su lista este Cliente
        clientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
       clientes.remove(cliente);
    }*/

   
    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }


    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }


}
