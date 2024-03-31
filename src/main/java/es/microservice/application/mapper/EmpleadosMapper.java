package es.microservice.application.mapper;

import java.util.List;

import es.microservice.application.model.Empleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import es.microservice.application.entity.EmpleadosEntity;

@Mapper(componentModel = "spring")
public interface EmpleadosMapper {
    
    EmpleadosMapper INSTANCE = Mappers.getMapper(EmpleadosMapper.class);

    @Mapping(source = "idEmpleado", target = "id_empleado")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "idCentro", target = "id_centro")
    @Mapping(source = "centro.nombre", target = "centro")
    Empleado toApiDomain(EmpleadosEntity source);
    
    List<Empleado> toApiDomain(List<EmpleadosEntity> source);
    
    
    @Mapping(source = "id_empleado", target = "idEmpleado")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "id_centro", target = "idCentro")
    EmpleadosEntity toEntity(Empleado source);

}
