package com.example.spring_boot.services;

import com.example.spring_boot.converters.BaseConverter;
import com.example.spring_boot.exception.ServiceException;
import com.example.spring_boot.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<R extends BaseRepository<E,Long>,E,D> {
    @Autowired
    protected R repository;
    @Autowired
    protected BaseConverter<D,E>  converter;

    abstract public void add(D d) throws Exception;
    abstract public void update(D d) throws Exception;
    abstract public void deleteById(Long id) throws ServiceException;
    abstract public Optional<E> findById(Long id) throws Exception;
    abstract public List<E> getAll() throws Exception;
    abstract public List<E> findByExample(D d) ;


    }
