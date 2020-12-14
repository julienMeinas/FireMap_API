package com.istl.firemap_api.firemap_api.repository;

import com.istl.firemap_api.firemap_api.bo.Firework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FireworkRepository extends JpaRepository<Firework, Long> {
}
