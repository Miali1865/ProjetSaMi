package com.example.projetvehicule;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Predicate;

@Service
public class AuthentificationService {

    private final AuthentificationRepository authentificationRepository;

    @Autowired
    public AuthentificationService(AuthentificationRepository authentificationRepository) { this.authentificationRepository = authentificationRepository; }


    public Optional<Authentification> findUser(String login, String motdepasse) {
        Predicate<Authentification> predicate = authentification -> authentification.getLogin().equals(login) && authentification.getMotdepasse().equals(motdepasse);
        return authentificationRepository.findAll().stream().filter(predicate).findFirst();
    }
}
