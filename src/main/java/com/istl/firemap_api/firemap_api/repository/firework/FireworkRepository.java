package com.istl.firemap_api.firemap_api.repository.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FireworkRepository extends JpaRepository<Firework, Long> {
    @Query("SELECT f FROM Firework f WHERE f.fireworker.note >:note and f.crowded = :crowed and f.handicapAccess = :accessHandicap and f.price <= :price")
    public List<Firework> findFireworkByFilter(double note, String crowed, boolean accessHandicap, int price);
}
