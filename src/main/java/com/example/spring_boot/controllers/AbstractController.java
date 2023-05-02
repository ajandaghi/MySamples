package com.example.spring_boot.controllers;

import com.example.spring_boot.converters.BaseConverter;
import com.example.spring_boot.exception.ServiceException;
import com.example.spring_boot.services.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Transactional(readOnly = true)
public abstract class AbstractController<E, D> {

 @Autowired
 private AbstractService<? extends JpaRepository<E, Long>, E,D> service;

 @Autowired
 private BaseConverter<D, E> converter;

 @PostMapping()
 @Transactional
 public void add( @RequestBody D d) throws Exception {
//        LOGGER.debug("Add method called!");
//        LOGGER.info("Add arguments is :" + e);
  service.add(d);
 }

 @PutMapping()
 @Transactional
 public void update(@RequestBody D d) throws Exception {
  service.update(d);
 }

 @DeleteMapping("/{id}")
 @Transactional
 public void deleteById(@PathVariable("id") Long id) throws ServiceException {
  service.deleteById(id);
 }

 @GetMapping("/{id}")
 public D findById(@PathVariable("id") Long id) throws Exception {
  return converter.convertEntity(service.findById(id).get());
 }

 @GetMapping()
 public List<D> getAll(@RequestParam("pageIndex") int pageIndex, @RequestParam("pageSize") int pageSize)
         throws Exception {
  return converter.convertEntity(service.getAll());
 }

 @PostMapping("/search")
 public List<D> findByExample(@RequestBody D d) {
  return converter.convertEntity(this.service.findByExample(d));
 }
}
