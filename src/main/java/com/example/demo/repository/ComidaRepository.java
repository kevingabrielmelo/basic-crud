package com.example.demo.repository;

import com.example.demo.entity.Comida;
import org.springframework.data.repository.CrudRepository;

public interface ComidaRepository extends CrudRepository<Comida, String> {}
