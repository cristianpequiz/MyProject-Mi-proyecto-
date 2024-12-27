
package com.example.services;

import com.example.dao.DepartamentoDao;
import com.example.entididades.Empleado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.EmpleadoDao;
import com.example.entididades.Departamento;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoServicioImp implements EmpleadoServicio{

    @Autowired
    public EmpleadoDao empleadoDao;
    
    @Autowired
    public DepartamentoDao departamentoDao;

    
    //Metodo que le da funcionalidad ala interfaz EmpleadoServicio para mostrar todos los empleados de la base de datos
    @Override
    public List<Empleado> mostrarEmpleados(Departamento departamento) {
        return empleadoDao.findByDepartamento(departamento);
    }

    //Metodo que le da funcinoalidad ala interfaz EmpleadoServicio para guardar un empleado a la base de datos
    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoDao.save(empleado);
    }
    
    //Metodo para borrar empleado
    @Override
    public void borrarEmpleado(Empleado empleado) {
        empleadoDao.delete(empleado);
    }
   
    
    
}
