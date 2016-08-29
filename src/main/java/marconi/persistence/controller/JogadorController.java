package marconi.persistence.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import marconi.persistence.entity.Jogador;
import marconi.persistence.service.JogadorService;
/**
 * Created by flavio.mendes on 22/08/2016.
 */

@RestController
@RequestMapping("/jogador")
public class JogadorController {


    @Autowired
    JogadorService jogadorService;
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Jogador> get() {
        return jogadorService.listJogador();
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody Jogador jogador) {
        jogadorService.saveJogador(jogador);

        HttpHeaders httpHeaders = new HttpHeaders();

        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@RequestBody Jogador jogador) {
        HttpHeaders httpHeaders = new HttpHeaders();
        if(jogador.getId() == null) {
            return new ResponseEntity<>(null, httpHeaders, HttpStatus.BAD_REQUEST);
        }

        jogadorService.saveJogador(jogador);


        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?>  delete(@RequestBody Jogador jogador) {
        jogadorService.deleteJogador(jogador);
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.OK);
    }

}