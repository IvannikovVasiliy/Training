package com.example.training.repository;

import com.example.training.entity.JcContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JcContactRepository extends JpaRepository<JcContact, Long> {
}
