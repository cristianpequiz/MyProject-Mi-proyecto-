
package com.example.entididades;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="departamento")
public class Departamento implements Serializable{
    
    private static final long serialVersionUID=1L;
    
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id_departamento;
private String nombre;
    
}
