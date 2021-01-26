package com.istl.firemap_api.firemap_api.repository.firework;

import com.istl.firemap_api.firemap_api.bo.Firework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FireworkRepository extends JpaRepository<Firework, Long> {
    @Query("SELECT f FROM Firework f WHERE 6 >:note and f.crowded LIKE CONCAT(:crowed,'%') and f.handicapAccess = :accessHandicap and f.price <= :price and f.duration LIKE CONCAT(:duration,'%')")
    public List<Firework> findFireworkByFilter(double note, String crowed, boolean accessHandicap, double price, String duration);

    @Query("SELECT f FROM Firework f WHERE UPPER(f.city) LIKE CONCAT(UPPER(:city), '%')")
    public List<Firework> findFireworkByCity(String city);

    @Query("SELECT f FROM Firework f WHERE f.date >= current_date ORDER BY f.date")
    public List<Firework> getFireworkFuture();

    @Query("SELECT f FROM Firework f ORDER BY f.date")
    public List<Firework> getAllFirework();

}
