package com.example.spring_boot.services;

import com.example.spring_boot.converters.TransactionConverter;
import com.example.spring_boot.exception.ServiceException;
import com.example.spring_boot.models.entities.Transaction;
import com.example.spring_boot.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService extends AbstractService<TransactionRepository, Transaction, com.example.spring_boot.models.Dto.Transaction> {
    @Autowired
    AccountService accountService;

    @Override
    public void add(com.example.spring_boot.models.Dto.Transaction transaction) throws Exception {
      Transaction trn=converter.convertDto(transaction) ;
      trn.setAccount(accountService.findById(transaction.getAccountId()).get());
      repository.save(trn);
    }


    @Override
    public void update(com.example.spring_boot.models.Dto.Transaction transaction) throws Exception {
        Transaction trn=converter.convertDto(transaction) ;
        trn.setAccount(accountService.findById(transaction.getAccountId()).get());
        repository.save(trn);
    }

    @Override
    public void deleteById(Long id) throws ServiceException {
        repository.deleteById(id);

    }

    @Override
    public Optional<Transaction> findById(Long id) throws Exception {
        return repository.findById(id);
    }

    @Override
    public List<Transaction> getAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public List<Transaction> findByExample(com.example.spring_boot.models.Dto.Transaction transaction) {
        return repository.findAll(Example.of(converter.convertDto(transaction)));

    }
}
