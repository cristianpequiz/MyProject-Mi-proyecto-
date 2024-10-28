
package com.example.services;

import com.example.entididades.Departamento;
import java.util.List;


public interface DepartamentoServicio{
    
    
    //Metodo creado para mostrar los departamentos de la base de datos
    public List<Departamento> mostrarDepartamentos();
    
    //Metodo creado para locaiizar un departamento de la base de datos
    public Departamento localizarDepartamento(Long id_departamento);
    
    //Metodo para guardar un departamento en la base de datos
    public void guardarDepartamento(Departamento departamento);
    
    //Metodo para borrar un departamento en la base de datos
    public void borrarDepartamento(Departamento departamento);
}
