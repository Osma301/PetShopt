package com.example.petshop.resource;

import com.example.petshop.Service.PetService;
import com.example.petshop.model.Pet;
import com.example.petshop.repo.PetRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class Resource {
    private final PetService petService;
    private final PetRepo petRepo;

    public Resource(PetService petService, PetRepo petRepo) {
        this.petService = petService;
        this.petRepo = petRepo;
    }


    @GetMapping()
    public ResponseEntity<List<Pet>> getAllPets(){
        List<Pet> pets = petService.findAllPet();
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }


    @GetMapping("/find/{id}")
    public ResponseEntity<Pet> getPetById(@PathVariable("id") Long id){
            Pet pet = petService.findPetById(id);
            return new ResponseEntity<>(pet, HttpStatus.OK);
    }



    @PostMapping("/add")
    public ResponseEntity<Pet> addPet(@RequestBody Pet pet){
        Pet newPet =petService.addPet(pet);
        return new ResponseEntity<>(newPet, HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Pet> updatePet(@RequestBody Pet pet){
        Pet updatePet = petService.updatePet(pet);
        return  new ResponseEntity<>(updatePet, HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Pet> deletePet(@PathVariable("id") Long id){
        petService.deletePet(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
