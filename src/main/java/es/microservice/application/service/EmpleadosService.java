package es.microservice.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import es.microservice.application.entity.EmpleadosEntity;
import es.microservice.application.mapper.EmpleadosMapper;
import es.microservice.application.model.Empleado;
import es.microservice.application.repository.EmpleadosRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
@Validated
public class EmpleadosService {
private EmpleadosMapper mapper = EmpleadosMapper.INSTANCE;

    @Autowired
    private EmpleadosRepository repository;

    
    public EmpleadosService(EmpleadosRepository repository) {
        this.repository = repository;
    }
    
    
	public List<Empleado> getEmpleados() {
        return mapper.toApiDomain(repository.findAll());
    }

    public HttpStatus putEmpleadoId(int id, Empleado empleado) {
        Optional<EmpleadosEntity> optEmpleado = repository.findById(id);
        if (optEmpleado.isEmpty()) {
            return HttpStatus.NOT_FOUND;
        }
        empleado.setIdEmpleado(id);
        repository.save(mapper.toEntity(empleado));
        return HttpStatus.OK;
    }

    public HttpStatus deleteEmpleadoId(int id) {
        Optional<EmpleadosEntity> optEmpleado = repository.findById(id);
        if (optEmpleado.isEmpty()) {
            return HttpStatus.NOT_FOUND;
        }
        repository.deleteById(id);
        return HttpStatus.NO_CONTENT;
    }

    public HttpStatus postEmpleado(Empleado empleado) {
        EmpleadosEntity entity = mapper.toEntity(empleado);
        repository.save(entity);
        return HttpStatus.CREATED;
    }

    public Empleado getEmpleadoById(String id) {
        Optional<EmpleadosEntity> optEmpleado = repository.findById(Integer.valueOf(id));
        return optEmpleado.map(mapper::toApiDomain).orElse(null); 
    }
}

