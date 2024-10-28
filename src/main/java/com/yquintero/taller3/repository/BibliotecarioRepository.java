package com.yquintero.taller3.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yquintero.taller3.models.Bibliotecario;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {
    
}