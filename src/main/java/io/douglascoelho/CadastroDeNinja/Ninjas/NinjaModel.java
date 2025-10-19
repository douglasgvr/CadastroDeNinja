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
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;

    @ManyToMany
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}
