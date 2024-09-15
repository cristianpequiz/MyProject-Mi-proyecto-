
package com.example.services;

import com.example.entididades.Departamento;
import com.example.entididades.Empleado;
import java.util.List;


public interface EmpleadoServicio {    
    
    //Metodo para mostrar los empleados de la base de datos
    public List<Empleado> mostrarEmpleados(Departamento departamento);
    
    //Metodo para guardar un empleado a la base de datos
    public Empleado guardarEmpleado(Empleado empleado);
    
    public void borrarEmpleado(Empleado empleado);
    
}
