 
package com.example.web;

import com.example.entididades.Departamento;
import com.example.services.DepartamentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorAgregarDepartamento {
   
    @Autowired
    public DepartamentoServicio departamentoServicio;
    
    @PostMapping("/salvarDepartamento")
    public String salvarDepartamento(Departamento departamento){
        
        departamentoServicio.guardarDepartamento(departamento);
    
    return "redirect:/";
    }
    
}
