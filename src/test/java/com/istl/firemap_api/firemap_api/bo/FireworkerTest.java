package com.istl.firemap_api.firemap_api.bo;

import org.junit.jupiter.api.Test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FireworkerTest {
    @Test
    void fireworker_shouldBeAnEntity(){
        assertNotNull(Fireworker.class.getAnnotation(Entity.class));
    }

    @Test
    void fireworkerId_shouldBeAnId() throws NoSuchFieldException {
        assertNotNull(Fireworker.class.getDeclaredField("id").getAnnotation(Id.class));
    }

    @Test
    void fireworkerId_shouldBeAnGeneratedValue() throws NoSuchFieldException {
        assertNotNull(Fireworker.class.getDeclaredField("id").getAnnotation(GeneratedValue.class));
    }
}
