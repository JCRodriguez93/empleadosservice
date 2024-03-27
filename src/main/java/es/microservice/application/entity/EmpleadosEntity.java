package es.microservice.application.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
private Integer idEmpleado;

@Column(name = "NOMBRE")
private String nombre;

@Column(name = "ID_CENTRO")
private Integer idCentro;



@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, optional = true)
@JoinColumn(name = "ID_CENTRO", referencedColumnName="NUM_CENTRO", insertable = false, updatable=false)
private CentrosEntity centro;


}
