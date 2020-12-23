package com.istl.firemap_api.firemap_api.repository.fireworker;

import com.istl.firemap_api.firemap_api.bo.Firework;
import com.istl.firemap_api.firemap_api.bo.FireworkerDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FireworkerRepository extends JpaRepository<FireworkerDetail, Long> {
}
