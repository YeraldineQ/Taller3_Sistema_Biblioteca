package com.yquintero.taller3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yquintero.taller3.models.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    

}
