package com.geogodoy.aumigo.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "animal")
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private ESex sex;

    private String age;

    private String weight;

    private ESpecie specie;

    private Long organizationId;
}
