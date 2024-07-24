package com.riwi.MultimediaInhalte.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.MultimediaInhalte.domain.entities.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long>{
}
