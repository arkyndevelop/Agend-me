package br.com.agend.me.domain.medic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MedicRepository extends JpaRepository<String, UUID> {
}
