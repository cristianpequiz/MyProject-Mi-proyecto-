
package com.example.web;

import com.example.entididades.Empleado;
import com.example.services.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorEmpleadoDepartamento {

    @Autowired
    EmpleadoServicio empleadoServicio;
    
    @GetMapping("volverAMenu")
    public String volverAMenu(){
    
        return "redirect:/";
                
    }
    
    //Meotodo para manejar la solicitud "/borrarEmpleado" para borrar un empleado de la base de datos
    @GetMapping("/borrarEmpleado")
    public String borrar(Empleado empleado){
    
        empleadoServicio.borrarEmpleado(empleado);
        
        return "redirect:/";
    }
    
    
    
    
}