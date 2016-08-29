package marconi.persistence.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by marconi.junior on 19/08/2016.
 */
@Entity
@Table(name = "jogador")
public class Jogador {
    @Column(name = "id_jogador")
    @Id
    private Long id;
    @Column(name = "nome")
    private String nome;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "data_nascimento")
    private Date dataNascimento;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
