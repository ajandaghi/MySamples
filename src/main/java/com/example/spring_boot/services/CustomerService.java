package com.example.spring_boot.services;

import com.example.spring_boot.converters.CustomerConverter;
import com.example.spring_boot.exception.ServiceException;
import com.example.spring_boot.models.entities.Customer;
import com.example.spring_boot.repositories.BaseRepository;
import com.example.spring_boot.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService extends AbstractService<BaseRepository<Customer,Long>, Customer, com.example.spring_boot.models.Dto.Customer>  {


    @Override
    public void add(com.example.spring_boot.models.Dto.Customer customer) throws Exception {
      repository.save(converter.convertDto(customer));
    }

    @Override
    public void update(com.example.spring_boot.models.Dto.Customer customer) throws Exception {
        repository.save(converter.convertDto(customer));

    }

    @Override
    public void deleteById(Long id) throws ServiceException {
         repository.deleteById(id);
    }

    @Override
    public Optional<Customer> findById(Long id) throws Exception {
     return repository.findById(id);
    }

    public List<Customer> findById(List<Long> ids) throws Exception {
        List<Customer> customers = new ArrayList<>();
        for (Long id : ids) {
            customers.add(repository.findById(id).get());
        }
        return customers;
    }

    @Override
    public List<Customer> getAll() throws Exception {
        return null;
    }

    @Override
    public List<Customer> findByExample(com.example.spring_boot.models.Dto.Customer customer) {
        return repository.findAll(Example.of(converter.convertDto(customer)));
    }
}
