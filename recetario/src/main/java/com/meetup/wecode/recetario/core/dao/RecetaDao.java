package com.meetup.wecode.recetario.core.dao;

import com.meetup.wecode.recetario.core.model.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecetaDao extends JpaRepository<Receta, Long>{
    Optional<Receta> findById(Long id);
    List<Receta> findAllByName(String name);
}
