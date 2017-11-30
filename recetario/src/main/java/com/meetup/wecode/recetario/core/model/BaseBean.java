package com.meetup.wecode.recetario.core.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class BaseBean {
    @Id
    @GeneratedValue
    private Long id;
}
