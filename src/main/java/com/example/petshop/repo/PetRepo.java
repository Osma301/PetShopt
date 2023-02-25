package com.example.petshop.repo;

import com.example.petshop.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface PetRepo extends JpaRepository<Pet,Long> {


    Optional<Object> findEmployedById(Long id);

    Optional<Object> findPetById(Long id);
}
