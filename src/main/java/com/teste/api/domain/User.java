package com.teste.api.domain;

import jakarta.persistence.*;
import lombok.*;

@Data //Adiciona Get,Set, Hash e ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;

}
