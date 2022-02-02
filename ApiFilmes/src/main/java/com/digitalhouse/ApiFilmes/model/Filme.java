package com.digitalhouse.ApiFilmes.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Filme {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String titulo;
    private String descricao;
    private String urlImg;

}
