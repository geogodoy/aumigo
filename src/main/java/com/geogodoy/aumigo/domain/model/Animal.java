package com.geogodoy.aumigo.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "animal")
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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ESex getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getWeight() {
        return weight;
    }

    public ESpecie getSpecie() {
        return specie;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(ESex sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setSpecie(ESpecie specie) {
        this.specie = specie;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }
}
