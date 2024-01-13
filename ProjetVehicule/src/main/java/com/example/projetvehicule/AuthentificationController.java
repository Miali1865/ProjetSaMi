package com.example.projetvehicule;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/authentification")
public class AuthentificationController {

    private final AuthentificationService authentificationService;

    @Autowired
    public AuthentificationController(AuthentificationService authentificationService ) { this.authentificationService = authentificationService; }

    @GetMapping("/{login}/{motdepasse}")
    public Optional<Authentification> findUser(@PathVariable String login, @PathVariable String motdepasse) {
        Optional<Authentification> find = authentificationService.findUser(login,motdepasse);
        return find;
    }

    @GetMapping("connexion/{login}/{motdepasse}")
    public ResponseEntity<String> ifUserCanConnect(@PathVariable String login, @PathVariable String motdepasse) {
        Optional<Authentification> find = authentificationService.findUser(login,motdepasse);
        if(find.isPresent()) {
            return ResponseEntity.ok("L'utilisateur "+login+" peut se connecter");
        } else {
            return ResponseEntity.ok("Echec de la connexion");
        }
    }


}
