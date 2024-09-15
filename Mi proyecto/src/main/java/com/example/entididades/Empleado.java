
package com.example.entididades;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data   
@Entity  
@Table(name="empleado")  
public class Empleado implements Serializable{   
    
    private static final long serialVersionUID=1L;    
    
    @Id   
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long id_empleado;
    private String nombre;
    private String edad;
    private String telefono;
    @ManyToOne
    @JoinColumn(name="empleados_departamentos")
    private Departamento departamento;
 
}


