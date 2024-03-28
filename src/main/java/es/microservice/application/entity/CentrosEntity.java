package es.microservice.application.entity;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
