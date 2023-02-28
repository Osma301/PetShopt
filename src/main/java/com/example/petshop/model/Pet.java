package com.example.petshop.model;

import Enum.EnumPet;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String petName;

    private String petAge;

    private String petRace;

    private String petWeight;

    private String hairTipe;

    private EnumPet enumPetTratamiento;

    private String imageUrl;

    @Column(nullable = false,updatable = false)
    private String petCode;

    public Pet(){

    }

    public Pet(Long id, String petName, String petAge, String petRace, String petWeight, String petCode) {
        this.id = id;
        this.petName = petName;
        this.petAge = petAge;
        this.petRace = petRace;
        this.petWeight = petWeight;
        this.petCode = petCode;
    }


    public String getHairTipe() {
        return hairTipe;
    }

    public void setHairTipe(String hairTipe) {
        this.hairTipe = hairTipe;
    }

    public EnumPet getEnumPet() {
        return enumPetTratamiento;
    }

    public void setEnumPet(EnumPet enumPet) {
        this.enumPetTratamiento = enumPet;
    }

    public String getPetCode() {
        return petCode;
    }

    public void setPetCode(String petCode) {
        this.petCode = petCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetAge() {
        return petAge;
    }

    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    public String getPetRace() {
        return petRace;
    }

    public void setPetRace(String petRace) {
        this.petRace = petRace;
    }

    public String getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(String petWeight) {
        this.petWeight = petWeight;
    }

    public EnumPet getEnumPetTratamiento() {
        return enumPetTratamiento;
    }

    public void setEnumPetTratamiento(EnumPet enumPetTratamiento) {
        this.enumPetTratamiento = enumPetTratamiento;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", petName='" + petName + '\'' +
                ", petAge='" + petAge + '\'' +
                ", petRace='" + petRace + '\'' +
                ", petWeight='" + petWeight + '\'' +
                ", hairTipe='" + hairTipe + '\'' +
                ", enumPetTratamiento=" + enumPetTratamiento +
                ", imageUrl='" + imageUrl + '\'' +
                ", petCode='" + petCode + '\'' +
                '}';
    }
}
