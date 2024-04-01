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

    @Mapping(source = "idEmpleado", target = "idEmpleado")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "idCentro", target = "idCentro")
    @Mapping(source = "centro.nombreCentro", target = "centro")
    Empleado toApiDomain(EmpleadosEntity source);

    List<Empleado> toApiDomain(List<EmpleadosEntity> source);


    @Mapping(source = "idEmpleado", target = "idEmpleado")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "idCentro", target = "idCentro")
    @Mapping(target = "centro", ignore=true)
    EmpleadosEntity toEntity(Empleado source);

}
