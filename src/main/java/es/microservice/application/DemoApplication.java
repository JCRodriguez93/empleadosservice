package es.microservice.application;


import es.microservice.application.controller.EmpleadosController;
import es.microservice.application.entity.EmpleadosEntity;
import es.microservice.application.mapper.EmpleadosMapper;
import es.microservice.application.service.EmpleadosService;
import org.mapstruct.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "{es.microservice.application}")
@EnableJpaRepositories(basePackages = "{es.microservice.application.repository}")
@ComponentScan(basePackages= "{es.microservice.application}")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}


}