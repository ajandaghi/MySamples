package com.example.spring_boot.services;

import com.example.spring_boot.converters.AccountConverter;
import com.example.spring_boot.converters.CardConverter;
import com.example.spring_boot.exception.ServiceException;
import com.example.spring_boot.models.entities.Account;
import com.example.spring_boot.models.entities.Card;
import com.example.spring_boot.repositories.BaseRepository;
import com.example.spring_boot.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService extends AbstractService<CardRepository, Card, com.example.spring_boot.models.Dto.Card> {


@Autowired
    AccountService accountService;


    @Override
    public void add(com.example.spring_boot.models.Dto.Card card) throws Exception {
        Card crd=converter.convertDto(card);
        Account acc =accountService.findById(card.getAccountId()).get();

        crd.setAccount(acc);
        repository.save(crd);

        acc.setCard(crd);
        accountService.update(accountService.converter.convertEntity(acc));

    }

    @Override
    public void update(com.example.spring_boot.models.Dto.Card card) throws Exception {
        Card crd=converter.convertDto(card);
        Account acc =accountService.findById(card.getAccountId()).get();

        crd.setAccount(acc);
        repository.save(crd);

        acc.setCard(crd);
        accountService.update(accountService.converter.convertEntity(acc));
    }

    @Override
    public void deleteById(Long id) throws ServiceException {
     repository.deleteById(id);
    }

    @Override
    public Optional<Card> findById(Long id) throws Exception {
        return repository.findById(id);
    }

    public Card findByAccountId(Long accountId)throws Exception{
        return repository.findCardByAccount_Id(accountId);
    }
    @Override
    public List<Card> getAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public List<Card> findByExample(com.example.spring_boot.models.Dto.Card card) {
        return repository.findAll(Example.of(converter.convertDto(card)));
    }
}
