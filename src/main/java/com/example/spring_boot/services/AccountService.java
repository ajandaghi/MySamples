package com.example.spring_boot.services;

import com.example.spring_boot.converters.AccountConverter;
import com.example.spring_boot.converters.CustomerConverter;
import com.example.spring_boot.exception.ServiceException;
import com.example.spring_boot.models.entities.Account;
import com.example.spring_boot.models.entities.Customer;
import com.example.spring_boot.repositories.AccountRepository;
import com.example.spring_boot.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService extends AbstractService<AccountRepository, Account, com.example.spring_boot.models.Dto.Account> {

    @Autowired
    CustomerService customerService;








    @Override
    public void add(com.example.spring_boot.models.Dto.Account account) throws Exception {
        List<Customer> customers = customerService.findById(account.getCustomerIds());
        Account acc = converter.convertDto(account);

        acc.setCustomers(customers);
        repository.save(acc);





    }

    @Override
    public void update(com.example.spring_boot.models.Dto.Account account) throws Exception {
        List<Customer> customers = customerService.findById(account.getCustomerIds());
        Account acc = converter.convertDto(account);

        acc.setCustomers(customers);
        repository.save(acc);


    }

    @Override
    public void deleteById(Long id) throws ServiceException {
      repository.deleteById(id);
    }

    @Override
    public Optional<Account> findById(Long id) throws Exception {
        return repository.findById(id);
    }

    @Override
    public List<Account> getAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public List<Account> findByExample(com.example.spring_boot.models.Dto.Account account) {
        return repository.findAll(Example.of(converter.convertDto(account)));
    }
}
