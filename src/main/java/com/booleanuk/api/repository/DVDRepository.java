package com.booleanuk.api.repository;

import com.booleanuk.api.model.DVD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DVDRepository extends JpaRepository<DVD, Integer> {}
