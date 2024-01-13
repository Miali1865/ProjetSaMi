package back.controller;


import back.model.Marque;
import back.service.MarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marque")
public class MarqueController {

    private final MarqueService marqueService;

    @Autowired
    public MarqueController(MarqueService marqueService) { this.marqueService = marqueService; }

    @PostMapping
    public ResponseEntity<Marque> addMarque(@RequestBody Marque marque) {
        Marque createdMarque = marqueService.addMarque(marque);
        return new ResponseEntity<>(createdMarque, HttpStatus.CREATED);
    }

    @GetMapping("/listemarque")
    public Iterable<Marque> getMarque() { return marqueService.getAllMarque(); }
}
