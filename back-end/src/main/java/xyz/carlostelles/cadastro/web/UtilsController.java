package xyz.carlostelles.cadastro.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.carlostelles.cadastro.business.data.PessoaTipo;
import xyz.carlostelles.cadastro.business.data.Ufs;

@Component
@RestController
@CrossOrigin
@RequestMapping(value = "/utils")
public class UtilsController {

    @GetMapping(value = "/ufs")
    public ResponseEntity<?> getUfs() {
        return new ResponseEntity<>(Ufs.values(), HttpStatus.OK);
    }

    @GetMapping(value = "/pessoa-tipo")
    public ResponseEntity<?> getPessoaTipo() {
        return new ResponseEntity<>(PessoaTipo.values(), HttpStatus.OK);
    }

}