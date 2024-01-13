package com.example.projetvehicule;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthentificationRepository extends JpaRepository<Authentification, Integer> {
}
