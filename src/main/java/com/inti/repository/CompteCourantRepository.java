package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CompteCourant;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Long>{

}
