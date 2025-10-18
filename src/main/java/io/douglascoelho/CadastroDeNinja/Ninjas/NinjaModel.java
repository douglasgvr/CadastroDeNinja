package io.douglascoelho.CadastroDeNinja.Ninjas;

import io.douglascoelho.CadastroDeNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToMany
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}
