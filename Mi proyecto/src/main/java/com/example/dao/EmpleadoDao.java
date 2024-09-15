
package com.example.dao;


import com.example.entididades.Departamento;
import com.example.entididades.Empleado;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface EmpleadoDao extends CrudRepository<Empleado,Long> {
    
    // Metodo que hace un pedido sql a la base de datos para que le de la cantidad de empleados de un departamento
    @Query(value = "SELECT COUNT(*) FROM empleado WHERE empleados_departamentos = ?1", nativeQuery = true)
    long countByDepartamentoIdNative(Long departamentoId);
    
    public List<Empleado> findByDepartamento(Departamento departamento);
}

