package com.geogodoy.aumigo.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "donation")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double value;

    @Enumerated(EnumType.STRING)
    private EDonationStatus status;

    private String description;

    private Long organizationId;

    public Long getId() {
        return id;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public String getDescription() {
        return description;
    }

    public EDonationStatus getStatus() {
        return status;
    }

    public Double getValue() {
        return value;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setStatus(EDonationStatus status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }
}
