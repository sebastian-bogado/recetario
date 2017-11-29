package com.meetup.wecode.recetario.core.dao;

import com.meetup.wecode.recetario.core.model.Recetario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecetarioDao extends JpaRepository<Recetario, Long>{
    Optional<Recetario> findById(Long id);
    List<Recetario> findAllByName(String name);

}
