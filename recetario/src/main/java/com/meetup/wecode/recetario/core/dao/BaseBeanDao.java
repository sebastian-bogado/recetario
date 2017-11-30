package com.meetup.wecode.recetario.core.dao;

import com.meetup.wecode.recetario.core.model.BaseBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface BaseBeanDao<T extends BaseBean> extends JpaRepository<T, Long>{
    Optional<T> findById(Long id);
}
