package com.istl.firemap_api.firemap_api.repository.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FireworkRepository extends JpaRepository<Firework, Long> {
    @Query(value = "SELECT e from Firework e where e.fireworker.note >:note", nativeQuery = true)
    public List<Firework> findFireworkByFilter(double note);
}
