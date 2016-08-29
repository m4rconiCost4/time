package marconi.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import marconi.persistence.entity.Jogador;
import marconi.persistence.repo.JogadorRepository;
/**
 * Created by marconi.junior on 19/08/2016.
 */
@Service
public class JogadorService {

    @Autowired
    JogadorRepository jogadorRepository;

    public void saveJogador(Jogador jogador) {


        jogadorRepository.save(jogador);
    }


    public Iterable<Jogador> listJogador(){
        return jogadorRepository.findAll();
    }

    public void deleteJogador(Jogador jogador) {
        jogadorRepository.delete(jogador);
    }

}
