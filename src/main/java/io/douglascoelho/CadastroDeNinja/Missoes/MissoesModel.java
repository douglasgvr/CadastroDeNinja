package io.douglascoelho.CadastroDeNinja.Missoes;

import io.douglascoelho.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String missao;

    private String dificuldade;

    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
