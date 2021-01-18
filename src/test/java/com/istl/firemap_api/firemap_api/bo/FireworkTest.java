package com.istl.firemap_api.firemap_api.bo;

import org.junit.jupiter.api.Test;

import javax.persistence.*;

import static org.junit.jupiter.api.Assertions.*;

public class FireworkTest {

    @Test
    void firework_shouldBeAnEntity(){
        assertNotNull(Firework.class.getAnnotation(Entity.class));
    }

    @Test
    void fireworkDetailId_shouldBeAnId() throws NoSuchFieldException {
        assertNotNull(Firework.class.getDeclaredField("id").getAnnotation(Id.class));
    }

    @Test
    void fireworkDetailId_shouldBeAnGeneratedValue() throws NoSuchFieldException {
        assertNotNull(Firework.class.getDeclaredField("id").getAnnotation(GeneratedValue.class));
    }
}
