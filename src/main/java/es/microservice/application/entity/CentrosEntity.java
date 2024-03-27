package es.microservice.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Validated
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CENTROS")
public class CentrosEntity {

@Id
@Column(name="NUM_CENTRO")
private int numCentro;

@Column(name="NOMBRE_CENTRO")
private String nombreCentro;

	
	
}
