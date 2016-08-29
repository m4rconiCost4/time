package marconi.persistence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import marconi.persistence.entity.Jogador;
import marconi.persistence.repo.JogadorRepository;

@Service
public class JogadorService {

    @Autowired
    JogadorRepository jogadorRepository;

    public void saveJogador(Jogador jogador) {

//        if(jogador.getName() == null) {
//            throw new Exception("Não pode ter nome nulo");
//        }
//        employee.setRegistrationNumber(geraMatricula());
        jogadorRepository.save(jogador);
    }


    public Iterable<Jogador> listJogador(){
        return jogadorRepository.findAll();
    }

    public void deleteJogador(Jogador jogador) {
        jogadorRepository.delete(jogador);
    }

}
