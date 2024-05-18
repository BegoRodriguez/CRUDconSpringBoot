package com.example.servicio;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.*;
import com.example.repositorio.*;
 
@Service
@Transactional
public class ProductService {
 
    @Autowired
    private ProductRepository repo;
     
    public List<Producto> listAll() {
        return repo.findAll();
    }
     
    public void save(Producto product) {
        repo.save(product);
    }
     
    public Producto get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
}
