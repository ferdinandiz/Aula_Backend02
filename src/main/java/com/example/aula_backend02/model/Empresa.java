package com.example.aula_backend02.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empresa")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(length = 250)
    private String nome;
    @Column(unique = true, length = 50)
    private String cnpj;
    @Column(length = 250)
    private String endereco;
}
