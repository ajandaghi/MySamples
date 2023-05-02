package com.example.spring_boot.repositories;

import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import java.io.Serializable;

//public interface BaseRepository<E, ID extends Serializable> extends JpaRepository<E, ID>

@NoRepositoryBean
public interface BaseRepository<E,ID extends Serializable>  extends JpaRepository<E,ID>{
}
