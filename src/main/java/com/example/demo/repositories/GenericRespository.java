package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GenericRespository extends CrudRepository<UsuarioModel, Long> {
}
