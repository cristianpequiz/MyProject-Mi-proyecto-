
package com.example.web;

import com.example.entididades.Empleado;
import com.example.services.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorAgregarEmpleado {
  
    @Autowired
    public EmpleadoServicio empleadoServicio;
    
    
    //Metodo para manejar la solicitud "/salvarEmpleado" para guardar un empleado ala base de datos
    @PostMapping("/salvarEmpleado")
    public String AgregarEmpleado(Empleado empleado){
        empleadoServicio.guardarEmpleado(empleado);
    return "redirect:/";
    }
    
}
