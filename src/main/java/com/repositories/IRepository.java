package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Persona;

public interface IRepository extends JpaRepository<Persona, Integer>{

}
