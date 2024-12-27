
package com.example.services;

import com.example.dao.DepartamentoDao;
import com.example.entididades.Departamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServicioImp implements DepartamentoServicio{
    
    //Hacemos inyeccion de dependencia para usar 
    @Autowired
    DepartamentoDao departamentoDao;

    
    //Metodo que le da funcionalidad ala interfaz DepartamentoServicio para traer los departamentos de la base de datos
    @Override
    public List<Departamento> mostrarDepartamentos() {
        
        return (List<Departamento>) departamentoDao.findAll();
        
    }

    //Metodo que le da funcionalidad ala interfaz DepartamentoServicio para localizar un departamento de la base de datos
    @Override
    public Departamento localizarDepartamento(Long id_departamento) {
        return departamentoDao.findById(id_departamento).orElse(null);
    }

    //Metodo para guardar departamento
    @Override
    public void guardarDepartamento(Departamento departamento) {
        departamentoDao.save(departamento);
    }

    //Metodo para borrar departamento
    @Override
    public void borrarDepartamento(Departamento departamento) {
        departamentoDao.delete(departamento);
    }
    
}
