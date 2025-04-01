package com.geogodoy.aumigo.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double value;

    private Long walletId;

    private Long organizationId;

    private ETransactionType type;

    public Long getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public Long getWalletId() {
        return walletId;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public ETransactionType getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setWalletId(Long walletId) {
        this.walletId = walletId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public void setType(ETransactionType type) {
        this.type = type;
    }
}
