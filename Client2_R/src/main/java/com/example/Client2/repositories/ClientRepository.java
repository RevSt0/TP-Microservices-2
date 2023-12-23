package com.example.Client2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Client2.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{

}
