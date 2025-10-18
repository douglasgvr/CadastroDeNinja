package io.douglascoelho.CadastroDeNinja.Missoes;

import io.douglascoelho.CadastroDeNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
