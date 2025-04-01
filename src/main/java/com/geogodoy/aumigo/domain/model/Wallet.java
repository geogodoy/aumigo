package com.geogodoy.aumigo.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "wallet")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private Long organizationId;

    public Long getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }
}
