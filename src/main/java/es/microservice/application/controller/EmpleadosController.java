package es.microservice.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.microservice.application.api.EmpleadosApi;
import es.microservice.application.model.Empleado;
import es.microservice.application.model.EmpleadosResponse;
import es.microservice.application.service.EmpleadosService;


@RestController
@RequestMapping("/")
public class EmpleadosController implements EmpleadosApi{
	
	@Autowired
	private EmpleadosService service;
	
	

	public EmpleadosController(EmpleadosService service) {
		super();
		this.service = service;
	}



	@Override
	public ResponseEntity<EmpleadosResponse> getEmpleados(){
		EmpleadosResponse response = new EmpleadosResponse();
		response.setEmpleados(service.getEmpleados());
		return new ResponseEntity<EmpleadosResponse>(response,HttpStatus.OK);
	}
	
	

	@Override
	public ResponseEntity<Void> putEmpleadoId(String id, Empleado empleado){
		// TODO Auto-generated method stub
		HttpStatus status = service.putEmpleadoId(Integer.valueOf(id), empleado);
		return new ResponseEntity<>(status);
	}



	@Override
	public ResponseEntity<Empleado> getEmpleadoId(String id){
	    Empleado empleado = service.getEmpleadoById(id);
	    if (empleado != null) {
	        return ResponseEntity.ok(empleado);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}


	 @Override
	    public ResponseEntity<Void> deleteEmpleadoId(String id){
	        HttpStatus status = service.deleteEmpleadoId(Integer.valueOf(id));
	        return new ResponseEntity<>(status);
	    }




	 @Override
	    public ResponseEntity<Void> postEmpleado(@Valid Empleado empleado) {
	        HttpStatus status = service.postEmpleado(empleado);
	        return new ResponseEntity<>(status);
	    }


}
