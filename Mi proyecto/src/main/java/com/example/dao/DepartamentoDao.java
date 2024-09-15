
package com.example.dao;

import com.example.entididades.Departamento;
import org.springframework.data.repository.CrudRepository;


public interface DepartamentoDao extends CrudRepository<Departamento,Long> {
    
}