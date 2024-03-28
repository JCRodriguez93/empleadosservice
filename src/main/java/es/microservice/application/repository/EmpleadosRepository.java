package es.microservice.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import es.microservice.application.entity.EmpleadosEntity;


@Repository
public interface EmpleadosRepository extends JpaRepository<EmpleadosEntity, Integer> {
}
