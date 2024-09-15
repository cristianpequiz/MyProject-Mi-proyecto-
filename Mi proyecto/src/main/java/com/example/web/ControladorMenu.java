
package com.example.web;

import com.example.entididades.Departamento;
import com.example.entididades.Empleado;
import com.example.services.DepartamentoServicio;
import com.example.services.EmpleadoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorMenu {
    
    //Inyeccion de dependencia para usar los metodos de la interfaz DepartamentoServicio
    @Autowired
    public DepartamentoServicio departamentoServicio;
    
    //Inyeccion de dependencia para usar los metodos de la interfaz EmpleadoServicio
    @Autowired
    public EmpleadoServicio empleadoServicio;
    
    //Metodo que maneja la solicitud al iniciar la pagina, muestra los departamentos en el archivo HTML Menu
    @GetMapping("/")
    public String mostrarDepartamentos(Model model){
        
        List<Departamento> departamentos=departamentoServicio.mostrarDepartamentos();
        
        model.addAttribute("mostrarDepartamentos", departamentos);
        
        return "Menu";
    }
    
    //Metodo que maneja la solicitud "/empleado/{id_departamento}" para mostrar los empleados que pertenecen a la entidad departamento
    @GetMapping("/empleados/{id_departamento}")
    public String mostrarEmpleados(@PathVariable("id_departamento") Long id_departamento, Model model){
        
        model.addAttribute(id_departamento);
        
        Departamento departamento = departamentoServicio.localizarDepartamento(id_departamento);
        
        
        List<Empleado> empleados = empleadoServicio.mostrarEmpleados(departamento);
        
        model.addAttribute("mostrarEmpleados", empleados);
        
        return "EmpleadoDepartamento";
    }
    
        
    //Metodo que maneja la solicitud "/agregarEmpleado" para que esta se redireccione al archivo html AgregarEmpleado
    @GetMapping("/agregarEmpleado")
    public String agregarEmpleado(Empleado empleado){
        
    return "AgregarEmpleado";
    }
    
}
