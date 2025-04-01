package com.geogodoy.aumigo.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Table(name = "organization")
@Getter
@Setter
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String cnpj;

    private String address;

    private String phone;

    private String email;

    private String description;

    private Boolean active;

}
