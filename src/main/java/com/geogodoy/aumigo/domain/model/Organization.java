package com.geogodoy.aumigo.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "organization")
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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
