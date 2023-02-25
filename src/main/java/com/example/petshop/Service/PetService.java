package com.example.petshop.Service;

import com.example.petshop.PetNotFound.UserNotFoundExeption;
import com.example.petshop.model.Pet;
import com.example.petshop.repo.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private final PetRepo petRepo;

    @Autowired
    public PetService(PetRepo petRepo) {
        this.petRepo = petRepo;
    }

    public Pet findPetById(Long id) {
        return (Pet) petRepo.findPetById(id).orElseThrow(()-> new UserNotFoundExeption("User by id"+id+"was not found"));
    }



    public List<Pet> findAllPet() {
        return petRepo.findAll();
    }

    public Pet addPet(Pet pet) {
        return petRepo.save(pet);

    }

    public Pet updatePet(Pet pet) {
        return petRepo.save(pet);
    }

    public void deletePet(Long id) {

        petRepo.deleteById(id);

    }
}
