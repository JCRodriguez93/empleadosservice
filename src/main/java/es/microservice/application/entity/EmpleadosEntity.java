package es.microservice.application.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Entity
@Table(name = "EMPLEADOS")
public class EmpleadosEntity {

    @Id
    @Column(name = "ID_EMPLEADO")
    private int idEmpleado;

    @Column(name = "NOMBRE")
    private String nombre;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "ID_CENTRO", referencedColumnName = "NUM_CENTRO", insertable = false, updatable = false)
    private CentrosEntity centro;

}