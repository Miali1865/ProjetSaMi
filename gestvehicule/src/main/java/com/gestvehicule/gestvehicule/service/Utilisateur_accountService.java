package com.gestvehicule.gestvehicule.service;

import org.springframework.stereotype.Service;

import com.gestvehicule.gestvehicule.interfacerepository.Utilisateur_accountRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class Utilisateur_accountService {
    private final Utilisateur_accountRepository utilisateur_accountRepository;

    
}
