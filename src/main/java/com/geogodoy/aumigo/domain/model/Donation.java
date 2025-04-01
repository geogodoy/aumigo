package com.geogodoy.aumigo.domain.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "donation")
@Getter
@Setter
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double value;

    private EDonationStatus status;

    private String description;

    private Long organizationId;

}
