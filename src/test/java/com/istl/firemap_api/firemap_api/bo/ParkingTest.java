package com.istl.firemap_api.firemap_api.bo;

import org.junit.jupiter.api.Test;

import javax.persistence.*;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingTest {

    @Test
    void parking_shouldBeAnEmbeddable(){
        assertNotNull(Parking.class.getAnnotation(Embeddable.class));
    }
}
